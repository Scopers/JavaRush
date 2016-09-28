package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {
    public Solution(int i){};
    public Solution(int i, int k){};
    public Solution(int i, int k, int j){};

    protected Solution(double i){};
    protected Solution(Double i){};
    protected Solution(Integer i){};

//    private Solution(String i){};
//    private Solution(String i, int j){};
//    private Solution(Integer i, short l){};

    Solution (){};
    Solution (Object k, int l){};
    Solution (Object k, short o){};


}

