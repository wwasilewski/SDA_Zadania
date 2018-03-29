package Programowanie1.tydzien4.sobota.enumy;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args) {

        Tshirt tshirt = new Tshirt(Size.S);

//        if(tshirt.getSize() == Size.)
//
        for (Size size : Size.values())
        {
            System.out.println(size);
        }

        List<Tshirt> tshirtsList = new ArrayList<>();
        for (Tshirt t : tshirtsList)
        {
            switch (t.getSize())
            {
                case L:
                    break;
                case M:
                    break;
                case S:
                    break;
            }
        }
    }
}
