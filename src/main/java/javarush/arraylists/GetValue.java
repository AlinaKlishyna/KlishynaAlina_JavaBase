package javarush.arraylists;

import java.util.ArrayList;

public class GetValue {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> st = new ArrayList<>();
        st.add("1");
        st.add("22");
        st.add("333");
        st.add("4444");
        st.add("55555");
        System.out.println(st.size());

        st.forEach((s) -> System.out.println(s));
    }
}
