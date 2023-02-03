public class Celebrity {
    String name;
    String hairColor;
    float height;
    String profession;
    String origin;
    Boolean sex;
    int age;
    Boolean lifeStatus;
    Celebrity(String[] vals){
        name = vals[0];
        hairColor = vals[1];
        height = Float.parseFloat(vals[2]);
        profession = vals[3];
        origin = vals[4];
        sex = Boolean.parseBoolean(vals[5]);
        age = Integer.parseInt(vals[6]);
        lifeStatus = Boolean.parseBoolean(vals[7]);
    }
    Boolean compareName(String x){
        if(x.equalsIgnoreCase(name)){
            return true;
        }
        return false;
    }
    Boolean compareHairColor(String x){
        if(x.equalsIgnoreCase(hairColor)){
            return true;
        }
        return false;
    }
    Boolean compareHeight(float x, int compareType){
        switch (compareType) {
            case 0:
                if(x < height){
                    return true;
                }
                return false;

            case 1:
                if(x > height){
                    return true;
                }
                return false;
        }
        return false;
    }
    Boolean compareProfession(String x){
        if(x.equalsIgnoreCase(profession)){
            return true;
        }
        return false;
    }
    Boolean compareOrigin(String x){
        if(x.equalsIgnoreCase(origin)){
            return true;
        }
        return false;
    }
    Boolean compareSex(boolean x){
        if(x == sex){
            return true;
        }
        return false;
    }
    Boolean compareAge(float x, int compareType){
        switch (compareType) {
            case 0:
                if(x < age){
                    return true;
                }
                return false;

            case 1:
                if(x > age){
                    return true;
                }
                return false;
        }
        return false;
    }
    Boolean compareLifeStatus(boolean x){
        if(x == lifeStatus){
            return true;
        }
        return false;
    }
}
