package a_SingleMathSimpleLogicAlgo;

/* 
Переходим дорогу вслепую
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
// https://javarush.ru/tasks/com.javarush.task.task04.task0416
//Работа светофора для пешеходов запрограммирована следующим образом:
//        в начале каждого часа в течение трех минут горит зелёный сигнал,
//        затем в течение одной минуты - жёлтый,
//        а потом в течение одной минуты - красный,
//        затем опять зелёный горит три минуты и т. д.
//        Ввести с клавиатуры вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
//        Определить, сигнал какого цвета горит для пешеходов в этот момент.
//        Результат вывести на экран в следующем виде:
//        "зелёный" - если горит зелёный цвет,
//        "жёлтый" - если горит жёлтый цвет,
//        "красный" - если горит красный цвет.
//
//        Пример для числа 2.5:
//        зелёный
//
//        Пример для числа 3:
//        жёлтый
//
//        Пример для числа 4:
//        красный
//
//        Пример для числа 5:
//        зелёный
//
//        Требования:
//        •	Программа должна считывать вещественное число c клавиатуры.
//        •	Программа должна выводить текст на экран.
//        •	Если горит зелёный цвет, необходимо вывести текст: "зелёный"
//        •	Если горит жёлтый цвет, необходимо вывести текст: "жёлтый"
//        •	Если горит красный цвет, необходимо вывести текст: "красный"

public class LogicTrafficLights_0416 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();
        double tmp = Double.parseDouble(input);

        // green 3 m _ yellow 1m _ red 1m - and repeat again
        String res = "";
        if ((tmp % 5) >= 0 && (tmp % 5) < 3) {
            res = "зеленый";
        } else if ((tmp % 5) >= 3 && (tmp % 5) < 4) {
            res = "желтый";
        } else if ((tmp % 5) >= 4 && (tmp % 5) <= 5) {
            res = "красный";
        }
        System.out.println(res);
    }
}