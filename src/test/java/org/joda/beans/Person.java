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

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.joda.beans.impl.BasicMetaBean;
import org.joda.beans.impl.direct.DirectBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.flexi.FlexiBean;

/**
 * Mock person JavaBean, used for testing.
 * 
 * @author Stephen Colebourne
 */
public class Person extends DirectBean {

    /** The forename. */
    @PropertyDefinition
    private String forename;
    /** The surname. */
    @PropertyDefinition
    private String surname;
    /** The number of cars. */
    @PropertyDefinition
    private int numberOfCars;
    @PropertyDefinition
    private List<Address> addressList;
    @PropertyDefinition
    private Map<String, Address> otherAddressMap;
    @PropertyDefinition
    private FlexiBean extensions = new FlexiBean();

    //------------------------- AUTOGENERATED START -------------------------
    /**
     * The meta-bean for {@code Person}.
     * @return the meta-bean, not null
     */
    public static Meta meta() {
        return Meta.INSTANCE;
    }

    @Override
    public Meta metaBean() {
        return Meta.INSTANCE;
    }

    @Override
    protected Object propertyGet(String propertyName) {
        switch (propertyName.hashCode()) {
            case 467061063:  // forename
                return getForename();
            case -1852993317:  // surname
                return getSurname();
            case 926656063:  // numberOfCars
                return getNumberOfCars();
            case -1377524046:  // addressList
                return getAddressList();
            case 1368089592:  // otherAddressMap
                return getOtherAddressMap();
            case -1809421292:  // extensions
                return getExtensions();
        }
        return super.propertyGet(propertyName);
    }

    @SuppressWarnings("unchecked")
    @Override
    protected void propertySet(String propertyName, Object newValue) {
        switch (propertyName.hashCode()) {
            case 467061063:  // forename
                setForename((String) newValue);
                return;
            case -1852993317:  // surname
                setSurname((String) newValue);
                return;
            case 926656063:  // numberOfCars
                setNumberOfCars((int) (Integer) newValue);
                return;
            case -1377524046:  // addressList
                setAddressList((List<Address>) newValue);
                return;
            case 1368089592:  // otherAddressMap
                setOtherAddressMap((Map<String, Address>) newValue);
                return;
            case -1809421292:  // extensions
                setExtensions((FlexiBean) newValue);
                return;
        }
        super.propertySet(propertyName, newValue);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the forename.
     * @return the value of the property
     */
    public String getForename() {
        return forename;
    }

    /**
     * Sets the forename.
     * @param forename  the new value of the property
     */
    public void setForename(String forename) {
        this.forename = forename;
    }

    /**
     * Gets the the {@code forename} property.
     * @return the property, not null
     */
    public final Property<String> forename() {
        return meta().forename().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the surname.
     * @return the value of the property
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the surname.
     * @param surname  the new value of the property
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Gets the the {@code surname} property.
     * @return the property, not null
     */
    public final Property<String> surname() {
        return meta().surname().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the number of cars.
     * @return the value of the property
     */
    public int getNumberOfCars() {
        return numberOfCars;
    }

    /**
     * Sets the number of cars.
     * @param numberOfCars  the new value of the property
     */
    public void setNumberOfCars(int numberOfCars) {
        this.numberOfCars = numberOfCars;
    }

    /**
     * Gets the the {@code numberOfCars} property.
     * @return the property, not null
     */
    public final Property<Integer> numberOfCars() {
        return meta().numberOfCars().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the addressList.
     * @return the value of the property
     */
    public List<Address> getAddressList() {
        return addressList;
    }

    /**
     * Sets the addressList.
     * @param addressList  the new value of the property
     */
    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    /**
     * Gets the the {@code addressList} property.
     * @return the property, not null
     */
    public final Property<List<Address>> addressList() {
        return meta().addressList().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the otherAddressMap.
     * @return the value of the property
     */
    public Map<String, Address> getOtherAddressMap() {
        return otherAddressMap;
    }

    /**
     * Sets the otherAddressMap.
     * @param otherAddressMap  the new value of the property
     */
    public void setOtherAddressMap(Map<String, Address> otherAddressMap) {
        this.otherAddressMap = otherAddressMap;
    }

    /**
     * Gets the the {@code otherAddressMap} property.
     * @return the property, not null
     */
    public final Property<Map<String, Address>> otherAddressMap() {
        return meta().otherAddressMap().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the extensions.
     * @return the value of the property
     */
    public FlexiBean getExtensions() {
        return extensions;
    }

    /**
     * Sets the extensions.
     * @param extensions  the new value of the property
     */
    public void setExtensions(FlexiBean extensions) {
        this.extensions = extensions;
    }

    /**
     * Gets the the {@code extensions} property.
     * @return the property, not null
     */
    public final Property<FlexiBean> extensions() {
        return meta().extensions().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code Person}.
     */
    public static class Meta extends BasicMetaBean {
        /**
         * The singleton instance of the meta-bean.
         */
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-property for the {@code forename} property.
         */
        private final MetaProperty<String> forename = DirectMetaProperty.ofReadWrite(this, "forename", String.class);
        /**
         * The meta-property for the {@code surname} property.
         */
        private final MetaProperty<String> surname = DirectMetaProperty.ofReadWrite(this, "surname", String.class);
        /**
         * The meta-property for the {@code numberOfCars} property.
         */
        private final MetaProperty<Integer> numberOfCars = DirectMetaProperty.ofReadWrite(this, "numberOfCars", Integer.TYPE);
        /**
         * The meta-property for the {@code addressList} property.
         */
        @SuppressWarnings("unchecked")
        private final MetaProperty<List<Address>> addressList = DirectMetaProperty.ofReadWrite(this, "addressList", (Class) List.class);
        /**
         * The meta-property for the {@code otherAddressMap} property.
         */
        @SuppressWarnings("unchecked")
        private final MetaProperty<Map<String, Address>> otherAddressMap = DirectMetaProperty.ofReadWrite(this, "otherAddressMap", (Class) Map.class);
        /**
         * The meta-property for the {@code extensions} property.
         */
        private final MetaProperty<FlexiBean> extensions = DirectMetaProperty.ofReadWrite(this, "extensions", FlexiBean.class);
        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<Object>> map;

        @SuppressWarnings("unchecked")
        protected Meta() {
            LinkedHashMap temp = new LinkedHashMap();
            temp.put("forename", forename);
            temp.put("surname", surname);
            temp.put("numberOfCars", numberOfCars);
            temp.put("addressList", addressList);
            temp.put("otherAddressMap", otherAddressMap);
            temp.put("extensions", extensions);
            map = Collections.unmodifiableMap(temp);
        }

        @Override
        public Person createBean() {
            return new Person();
        }

        @Override
        public Class<? extends Person> beanType() {
            return Person.class;
        }

        @Override
        public Map<String, MetaProperty<Object>> metaPropertyMap() {
            return map;
        }

        //-----------------------------------------------------------------------
        /**
         * The meta-property for the {@code forename} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> forename() {
            return forename;
        }

        /**
         * The meta-property for the {@code surname} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> surname() {
            return surname;
        }

        /**
         * The meta-property for the {@code numberOfCars} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Integer> numberOfCars() {
            return numberOfCars;
        }

        /**
         * The meta-property for the {@code addressList} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<List<Address>> addressList() {
            return addressList;
        }

        /**
         * The meta-property for the {@code otherAddressMap} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Map<String, Address>> otherAddressMap() {
            return otherAddressMap;
        }

        /**
         * The meta-property for the {@code extensions} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<FlexiBean> extensions() {
            return extensions;
        }

    }

    //-------------------------- AUTOGENERATED END --------------------------
}
