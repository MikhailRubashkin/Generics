package Generics;



import static Generics.A.Type.INTEGER;

public class B {


    public static void main(String[] args) {
        try {
            A a = INTEGER.create(10);
            A b = INTEGER.create(20);
            System.out.println((Integer) a.sum(b));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

     class A<T> {
        private Type type;
        private T value;

        private A(Type type, T value) {
            this.type = type;
            this.value = value;
        }

        private T getValue() {
            return value;
        }

        private Type getType() {
            return type;
        }

        public Object sum(A a) {
            if (this.type.equals(a.getType())) {
                switch (type) {
                    case INTEGER: {
                        return sumInteger(a);
                    }
                    case STRING: {
                        return sumString(a);
                    }
                    default: {
                        throw new UnsupportedOperationException("Метод не поддерживается");
                    }
                }
            }
            throw new IllegalArgumentException();
        }

        private Integer sumInteger(A a) {
            return (Integer) this.value + (Integer) a.getValue();
        }

        private String sumString(A a) {
            return this.value + (String) a.getValue();
        }

        public enum Type {
            INTEGER {
                @Override
                public A create(Object obj) {
                    if (obj instanceof Integer) {
                        return new A<>(INTEGER, (Integer) obj);
                    }
                    throw new ClassCastException("Не верный тип");
                }
            },
            STRING {
                @Override
                public A create(Object obj) {
                    if (obj instanceof String) {
                        return new A<>(STRING, (String) obj);
                    }
                    throw new ClassCastException("Не верный тип");
                }
            };

            public abstract A create(Object obj);
        }
    }

