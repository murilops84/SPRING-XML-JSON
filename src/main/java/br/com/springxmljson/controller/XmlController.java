package br.com.springxmljson.controller;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

import br.com.springxmljson.model.Bank;

@Slf4j
@RestController()
public class XmlController {

    XmlController() {}


    @GetMapping(value = "/xml")
    public static void jaxbXmlFileToObject() {
        log.info("Inicio");
        JAXBContext jaxbContext;
        try {
            jaxbContext = JAXBContext.newInstance(Bank.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            Bank bank = (Bank) jaxbUnmarshaller.unmarshal(new StringReader(xml));

            log.info(bank.toString());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    private static String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n"
        + "<bank>"
        + "  <accounts>\n"
        + "     <Account>\n"
        + "       <portfolio>XPTO</portfolio>\n"
        + "       <number>123456-7</number>\n"
        + "       <value>123456.78</value>\n"
        + "     </Account>"
        + "     <Account>\n"
        + "       <portfolio>XYZ</portfolio>\n"
        + "       <number>765432-1</number>\n"
        + "       <value>876543.21</value>\n"
        + "     </Account>"
        + "  </accounts>"
        + "</bank>";

}
