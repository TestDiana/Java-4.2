public class BmiService {

        public float calculate(float weight, float growth) {

            float bmi = weight / (growth * growth) * 10000;

            return bmi;
        }
    }


