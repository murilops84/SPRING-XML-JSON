package br.com.springxmljson.model;

import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@NoArgsConstructor
@XmlRootElement(name = "account")
@XmlAccessorType(XmlAccessType.PROPERTY)
@Slf4j
public class Account {

    private String portfolio;
    private String number;
    private Float value;

    // It is called immediately after the object is created and before the unmarshalling begins.
    // The callback provides an opportunity to initialize JavaBean properties prior to unmarshalling.
    void beforeUnmarshal(Unmarshaller unmarshaller, Object parent) {
        log.info("Before Unmarshaller Callback " + unmarshaller.toString());
    }
 
    // It is called after all the properties are unmarshalled for this object,
    // but before this object is set to the parent object.
    void afterUnmarshal(Unmarshaller unmarshaller, Object parent) {
        log.info("After Unmarshaller Callback " + unmarshaller.toString());
    }
    
}
