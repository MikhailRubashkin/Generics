package Generics;

// Создать статический обобщённый метод swap в final классе PairUtil.
// Метод должен принимать объект класса Pair и возвращать пару, в которой элементы поменяны местами.


public final class PairUtil  {

    public static <K, V> Pair<V, K> swap (Pair <K,V> pair)
    {Pair<V,K> pair1 = new Pair <>(pair.getValue(),pair.getKey()); return pair1; }

    public static void main(String[] args) {

        Pair<Integer, Integer> a = new Pair <> (5,7);
        System.out.println(a.getKey() + " " + a.getValue());


    }
}




























