public class Pessoa {

    public static void main(String[] args) {
        System.out.println(getImc(70, 1.7, "masculino"));
        System.out.println(getImc(70, 1.7, "feminino"));
    }

    public static String getImc(double peso, double altura, String sexo) {
        double imc = peso / (altura * altura);

        if (sexo.equals("feminino")) {
            if (imc < 19.1) return "abaixo do peso";
            if (imc < 25.8) return "no peso normal";
            if (imc < 27.3) return "marginalmente acima do peso";
            if (imc < 32.3) return "acima do peso ideal";
            return "obeso";
        }

        if (sexo.equals("masculino")) {
            if (imc < 20.7) return "abaixo do peso";
            if (imc < 26.4) return "no peso normal";
            if (imc < 27.8) return "marginalmente acima do peso";
            if (imc < 31.1) return "acima do peso ideal";
            return "obeso";
        }

        return "Sexo inválido";
    }
}
