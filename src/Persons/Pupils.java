package Persons;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Pupils {
    public static void main(String[] args){
        Map<Integer, Persons> pupilsOfSchool = new HashMap();
        pupilsOfSchool.put(1001, new Persons(20, "Maria", "Wojcek"));
        pupilsOfSchool.put(1002, new Persons(15, "Marian", "Novak"));
        pupilsOfSchool.put(1003, new Persons(18, "Igor", "Chmelevski"));
        pupilsOfSchool.put(1004, new Persons(21, "Mikolaj", "Ivanov"));
        pupilsOfSchool.put(1005, new Persons(17, "Sabina", "Kopij"));

    System.out.println(pupilsOfSchool);

        Set<Map.Entry<Integer, Persons>> pupilsOfSchoolEntries = pupilsOfSchool.entrySet();
        Iterator<Map.Entry<Integer, Persons>> pupilsOfSchoolIterator = pupilsOfSchoolEntries.iterator();
        while (pupilsOfSchoolIterator.hasNext()){
            Map.Entry<Integer, Persons> entry = pupilsOfSchoolIterator.next();{
                if (entry.getValue().getAge() < 18){
                    System.out.println(entry.getValue().getFirstName()
                    + " ma mniej niz 18 lat");
                    pupilsOfSchoolIterator.remove();
                } else {
                    System.out.println(entry.getValue().getFirstName()
                            + " ma wiecej niz 18 lat");
                }
            }
            }
        System.out.println(pupilsOfSchool);
        }


}
