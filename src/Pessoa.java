public class Pessoa {
    public double peso;
    public double altura;
    public String sexo;

    public double getPeso() {
        return peso;
    }

    public void setPeso() {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura() {
        this.altura = altura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        if(!sexo.equals("masculino") && !sexo.equals("feminino")){
            throw new IllegalArgumentException();
        }
        this.sexo = sexo;
    }

    public String getImc() {
        double imc = peso / (altura * altura);

        if (sexo.equals("feminino")) {
            if(imc < 19.1){
                return "abaixo do peso";
            }else if (imc < 25.8){
                return "no peso normal";
            }else if (imc < 27.3){
                return "marginalmente acima do peso";
            }else if (imc < 32.3){
                return "acima do peso ideal";
            }
            return "obeso";
        }else{
            if(imc < 20.7){
                return "abaixo do peso";
            }else if (imc < 26.4){
                return "no peso normal";
            }else if (imc < 27.8){
                return "marginalmente acima do peso";
            }else if (imc < 31.1){
                return "acima do peso ideal";
            }
            return "obeso";
        }
    }
}
