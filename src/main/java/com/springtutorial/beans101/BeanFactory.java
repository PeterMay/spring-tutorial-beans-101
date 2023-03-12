package com.springtutorial.beans101;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.util.LinkedList;
import java.util.List;

public class BeanFactory implements BeanPostProcessor, BeanFactoryAware, DisposableBean {

    private final List<Object> prototypeBeans = new LinkedList<>();
    private org.springframework.beans.factory.BeanFactory beanFactory;

    @Override
    public void setBeanFactory(org.springframework.beans.factory.BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    @Override
    public void destroy() {
        // Synchronized - so there is no interference from other threads.
        synchronized (prototypeBeans) {
            // For each Bean, inside PROTOTYPE_BEANS list.
            for (Object bean : prototypeBeans) {
                // Check if Bean is disposable (aka implements destroy method).
                if (bean instanceof DisposableBean disposable) {
                    try {
                        disposable.destroy();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            prototypeBeans.clear();
        }
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        // If Bean is scoped as prototype, add it to PROTOTYPE_BEANS list.
        if (beanFactory.isPrototype(beanName)) {
            synchronized (prototypeBeans) {
                prototypeBeans.add(bean);
            }
        }
        return bean;
    }

}
