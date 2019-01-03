package service;

import model.ChallengeLevelXML;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LevelXML implements LevelDAO {
    public ChallengeLevelXML loadByName(String levelName) {
        try {
            FileReader fr = new FileReader(levelName);
            JAXBContext context = JAXBContext.newInstance(ChallengeLevelXML.class);
            Unmarshaller um = context.createUnmarshaller();

            ChallengeLevelXML challengeLevelXML = (ChallengeLevelXML) um.unmarshal(fr);
            fr.close();

            return challengeLevelXML;
        } catch (JAXBException | IOException e) {
            System.out.println("Brak pliku");
            return null;
        }
    }

    public boolean save(ChallengeLevelXML challengeLevel) {
        try {
            JAXBContext context = JAXBContext.newInstance(ChallengeLevelXML.class);
            Marshaller marshaller = context.createMarshaller();

            FileWriter fw = new FileWriter(challengeLevel.getName());
            marshaller.marshal(challengeLevel, fw);
        } catch (JAXBException | IOException e) {
            e.printStackTrace();
        }

        return false;
    }
}
