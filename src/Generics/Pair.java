package Generics;

//	Создать класс Pair, параметризованный двумя параметрами K и V. Класс должен хранить две переменные типов K и V соответственно.
// У класса должен быть конструктор, принимающий 2 параметра типов K и V, а также набор соответствующих геттеров/сеттеров.

class Pair<K, V> {

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
