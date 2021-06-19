public class Racket {
    public static void main(String[] args) {
        code();
    }

    public static void code() {
        //Racket code:

        System.out.println(
                new RacList<>("hi! :)",
                        new RacList<>(8,
                                new RacList<>(true,
                                        null))));
        System.out.println(
                car(new RacList<>("hi! :)",
                        new RacList<>(8,
                                new RacList<>(true,
                                        null)))));
        System.out.println(
                cdr(new RacList<>("hi! :)",
                        new RacList<>(8,
                                new RacList<>(true,
                                        null)))));

        System.out.println(
                cons( new RacList<>("my name is amirali!",
                                new RacList<>(5, null))
                        ,(cons(13.45,
                                new RacList<>("hi! :)",
                                        new RacList<>(8,
                                                new RacList<>(true,
                                                        null)))))));

    }








    //lang functions
    public static Object car(RacList<String> racList) {
        return racList.getLeft();
    }

    public static RacList cdr(RacList<String> racList) {
        return racList.getRight();
    }

    public static RacList<Object> cons(Object obj, RacList<Object> list) {
        return new RacList<>(obj, list);
    }

    public static boolean isList(Object obj) {
        return obj instanceof RacList;
    }

    public static Object RacIf(boolean cond, Object result1, Object result2) {
        if(cond)
            return result1;
        return result2;
    }
}
