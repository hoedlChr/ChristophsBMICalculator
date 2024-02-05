public class BMICalculator {
    private String firstname;
    private String lastname;
    private int bodyHeight;
    private double bodyWeight;
    private char gender;

    public BMICalculator(String firstname, String lastname, int bodyHeight, double bodyWeight, char gender) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.bodyHeight = bodyHeight;
        this.bodyWeight = bodyWeight;
        this.gender = gender;
    }

    public double calculateBMI(){
        double BMI = 0;
        BMI = (bodyWeight/((bodyHeight/100.0)*(bodyHeight/100.0)));
        return Math.round(100.0*BMI)/100.0;
    }


    public int calculateBMICategory(){
        double BMI = calculateBMI();
        int kategorie = 0;

        if(gender == 'm'){
            if(BMI < 16){
                kategorie = -2;
            } else if (BMI>= 16 && BMI <=18.4){
                kategorie = -1;
            }
            else if (BMI>= 18.5 && BMI <=24.9){
                kategorie = 0;
            }
            else if (BMI>= 25 && BMI <=34.9){
                kategorie = 1;
            }
            else if (BMI>= 35){
                kategorie = 2;
            }
        } else if (gender == 'w') {
            if(BMI < 15){
                kategorie = -2;
            } else if (BMI>= 15 && BMI <=17){
                kategorie = -1;
            }
            else if (BMI>= 17.5 && BMI <=23.9){
                kategorie = 0;
            }
            else if (BMI>= 24&& BMI <=33.9){
                kategorie = 1;
            }
            else if (BMI>= 34){
                kategorie = 2;
            }
        }
        return kategorie;
    }

    public String getBMICategoryName(){
        int kategorie = calculateBMICategory();
        String katName = "";

        switch (kategorie){
            case -2:
                katName = "Sehr starkes Untergewicht";
                break;
            case -1:
                katName = "Untergewicht";
                break;
            case 0:
                katName = "Normalgewicht";
                break;
            case 1:
                katName = "Übergewicht";
                break;
            case 2:
                katName = "Sehr starkes Übergewicht";
                break;
            default:
                katName = "";
                break;
        }
        return katName;
    }

    public void setBodyHeight(int bodyHeight) {
        this.bodyHeight = bodyHeight;
    }

    public void setBodyWeight(double bodyWeight) {
        this.bodyWeight = bodyWeight;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getBodyHeight() {
        return bodyHeight;
    }

    public double getBodyWeight() {
        return bodyWeight;
    }

    public char getGender() {
        return gender;
    }
}
