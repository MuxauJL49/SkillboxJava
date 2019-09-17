public class Loader {
    private static final int TOTAL_PATIENTS = 30;
    private static double[] patientsTemperature = new double[TOTAL_PATIENTS];
    private static double MIN_TEMPERATURE = 32.0d;
    private static double MAX_TEMPERATURE = 40.0d;

    public static void main(String[] args) {

        for(int i = 0; i < patientsTemperature.length; i++){
            var d = MIN_TEMPERATURE + (Math.random() * (MAX_TEMPERATURE - MIN_TEMPERATURE + 1));
            patientsTemperature[i] = (double)Math.round(d * 100) / 100;
            System.out.println((i + 1) + " - " + patientsTemperature[i]);
        }

        System.out.println("Healthy patients - " + checkHealthyPatient(patientsTemperature));
        System.out.println("Average temperature - " + averageTemperature(patientsTemperature));
    }


    public static double averageTemperature(double[] arrPatTemp){
        double result = 0.0d;
        for(var temperature : arrPatTemp){
            result += temperature;
        }
        return (double)Math.round((result / arrPatTemp.length) * 100) /100;
    }

    public static int checkHealthyPatient(double [] arrPatTemp){
        double minNormTem = 36.2d;
        double maxNormTem = 36.9d;
        int result = 0;
        for(var temperature : arrPatTemp){
            if(minNormTem <= temperature && temperature <= maxNormTem){
                result += 1;
            }
        }
        return result;
    }
}
