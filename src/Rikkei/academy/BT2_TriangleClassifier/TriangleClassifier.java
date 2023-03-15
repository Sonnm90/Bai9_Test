package Rikkei.academy.BT2_TriangleClassifier;

import java.util.Scanner;

public class TriangleClassifier {
    public  String triangleSide(int side1, int side2, int side3) {
        if (side1<=0||side2<=0||side3<=0)
            return ("khong phai tam giac");
      else if (side1==side2&&side1==side3)
          return ("tam giac deu");
      else if (side1==side2||side1==side3||side2==side3) {
          return ("tam giac can");
      } else if ((side1+side2>side3)&&((side1+side3)>side2)&&((side2+side3)>side1)) {
          return ("tam giac thuong");
      } else {
          return ("khong phai tam giac");
      }
    }
}
