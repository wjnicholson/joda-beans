/*
 *  Copyright 2001-2010 Stephen Colebourne
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.joda.beans;

/**
 * A meta-property, defining those aspects of a property which are not specific
 * to a particular bean, such as the property type and name.
 * 
 * @param <B>  the type of the bean
 * @param <P>  the type of the property content
 * @author Stephen Colebourne
 */
public interface MetaProperty<B, P> {

    /**
     * Creates a property that binds this meta-property to a specific bean.
     * 
     * @param bean  the bean to create the property for, not null
     * @return the property, never null
     */
    Property<B, P> createProperty(B bean);

    //-----------------------------------------------------------------------
    /**
     * Gets the property name.
     * <p>
     * The JavaBean style methods getFoo() and setFoo() will lead to a property
     * name of 'foo' and so on.
     * 
     * @return the name of the property, never null
     */
    String name();

    /**
     * Get the type of the property represented as a {@code Class}.
     * 
     * @return the type of the property, never null
     */
    Class<P> propertyClass();

    /**
     * Get the type of the bean represented as a {@code Class}.
     * 
     * @return the type of the bean, never null
     */
    Class<B> beanClass();

    /**
     * Gets whether the property is read-only, read-write or write-only.
     * 
     * @return the property read-write type, never null
     */
    ReadWriteProperty readWrite();

    //-----------------------------------------------------------------------
    /**
     * Gets the value of the bound property for the specified bean.
     * <p>
     * For a standard JavaBean, this is equivalent to calling <code>getFoo()</code> on the bean.
     * Alternate implementations may perform any logic to obtain the value.
     * 
     * @param bean  the bean to query, not null
     * @return the value of the property on the specified bean, may be null
     * @throws UnsupportedOperationException if the property is write-only
     */
    P get(B bean);

    /**
     * Sets the value of the bound property on the specified bean.
     * <p>
     * For a standard JavaBean, this is equivalent to calling <code>setFoo()</code> on the bean.
     * Alternate implementations may perform any logic to change the value.
     * 
     * @param bean  the bean to update, not null
     * @param value  the value to set into the property on the specified bean, may be null
     * @throws UnsupportedOperationException if the property is read-only
     */
    void set(B bean, P value);

}