package Generics;

//	 Реализовать класс вычислитель для вещественных и целых типов данных, используя параметризацию классов.

class Calculator {


    public static <E extends Number> Number summ(E arq1, E arq2) {
        if (arq1 instanceof Double) {
            return (Double) arq1 - (Double) arq2;
        } else return (Integer) arq1 + (Integer) arq2;
    }


    public static <E extends Number> double summ2(E arq1, E arq2) {
        if (arq1 instanceof Double) {
            return (Double) arq1 * (Double) arq2;
        } else return (Integer) arq1 + (Integer) arq2;
    }

    public static <E extends Number> double summ3(E arq1, E arq2) {
        if (arq1 instanceof Double) {
            return (Double) arq1 + (Double) arq2;
        } else return (Integer) arq1 + (Integer) arq2;
    }



    public static <E extends Number> double summ4( E arq1, E arq2) {
        if (arq1 instanceof Double){ return (Double) arq1 / (Double) arq2;
        }else return (Integer) arq1 + (Integer) arq2;}
}













