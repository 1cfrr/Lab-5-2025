import functions.*;
import functions.basic.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("=== ЛАБОРАТОРНАЯ РАБОТА №5: ПЕРЕОПРЕДЕЛЕНИЕ МЕТОДОВ OBJECT ===\n");

        testTask5Part1();
        testTask5Part2();
        testTask5Part3();
        testTask5Part4();

        System.out.println("\n=== ВСЕ ТЕСТЫ ВЫПОЛНЕНЫ ===");
    }

    public static void testTask5Part1() {
        System.out.println("1. ТЕСТИРОВАНИЕ МЕТОДОВ FunctionPoint:");

        FunctionPoint p1 = new FunctionPoint(1.5, 2.5);
        FunctionPoint p2 = new FunctionPoint(1.5, 2.5);
        FunctionPoint p3 = new FunctionPoint(1.5, 2.6);
        FunctionPoint p4 = new FunctionPoint(1.6, 2.5);

        System.out.println("   Точка p1: " + p1.toString());
        System.out.println("   Точка p2: " + p2.toString());
        System.out.println("   Точка p3: " + p3.toString());
        System.out.println("   Точка p4: " + p4.toString());

        System.out.println("\n   Тестирование equals():");
        System.out.println("   p1.equals(p2): " + p1.equals(p2) + " (ожидается true)");
        System.out.println("   p1.equals(p3): " + p1.equals(p3) + " (ожидается false)");
        System.out.println("   p1.equals(p4): " + p1.equals(p4) + " (ожидается false)");
        System.out.println("   p1.equals(null): " + p1.equals(null) + " (ожидается false)");
        System.out.println("   p1.equals(\"строка\"): " + p1.equals("строка") + " (ожидается false)");

        System.out.println("\n   Тестирование hashCode():");
        System.out.println("   p1.hashCode(): " + p1.hashCode());
        System.out.println("   p2.hashCode(): " + p2.hashCode());
        System.out.println("   p3.hashCode(): " + p3.hashCode());
        System.out.println("   p4.hashCode(): " + p4.hashCode());

        System.out.println("   p1.hashCode() == p2.hashCode(): " +
                (p1.hashCode() == p2.hashCode()) + " (ожидается true для равных объектов)");

        System.out.println("\n   Тестирование clone():");
        FunctionPoint p1Clone = (FunctionPoint) p1.clone();
        System.out.println("   p1: " + p1);
        System.out.println("   clone: " + p1Clone);
        System.out.println("   p1.equals(clone): " + p1.equals(p1Clone));
        System.out.println("   p1 == clone: " + (p1 == p1Clone) + " (ожидается false)");

        p1Clone.setX(10.0);
        System.out.println("   После изменения clone.x = 10.0:");
        System.out.println("   p1.x: " + p1.getX() + " (ожидается 1.5)");
        System.out.println("   clone.x: " + p1Clone.getX() + " (ожидается 10.0)");
    }

    public static void testTask5Part2() throws Exception {
        System.out.println("\n\n2. ТЕСТИРОВАНИЕ МЕТОДОВ ArrayTabulatedFunction:");

        FunctionPoint[] points1 = {
                new FunctionPoint(0, 0),
                new FunctionPoint(1, 1),
                new FunctionPoint(2, 4),
                new FunctionPoint(3, 9)
        };

        FunctionPoint[] points2 = {
                new FunctionPoint(0, 0),
                new FunctionPoint(1, 1),
                new FunctionPoint(2, 4),
                new FunctionPoint(3, 9)
        };

        FunctionPoint[] points3 = {
                new FunctionPoint(0, 0),
                new FunctionPoint(1, 1),
                new FunctionPoint(2, 4)
        };

        ArrayTabulatedFunction func1 = new ArrayTabulatedFunction(points1);
        ArrayTabulatedFunction func2 = new ArrayTabulatedFunction(points2);
        ArrayTabulatedFunction func3 = new ArrayTabulatedFunction(points3);

        System.out.println("   Функция func1: " + func1.toString());
        System.out.println("   Функция func2: " + func2.toString());
        System.out.println("   Функция func3: " + func3.toString());

        System.out.println("\n   Тестирование equals():");
        System.out.println("   func1.equals(func2): " + func1.equals(func2) + " (ожидается true)");
        System.out.println("   func1.equals(func3): " + func1.equals(func3) + " (ожидается false)");
        System.out.println("   func1.equals(null): " + func1.equals(null) + " (ожидается false)");
        System.out.println("   func1.equals(\"строка\"): " + func1.equals("строка") + " (ожидается false)");

        System.out.println("\n   Тестирование hashCode():");
        System.out.println("   func1.hashCode(): " + func1.hashCode());
        System.out.println("   func2.hashCode(): " + func2.hashCode());
        System.out.println("   func3.hashCode(): " + func3.hashCode());

        System.out.println("   func1.hashCode() == func2.hashCode(): " +
                (func1.hashCode() == func2.hashCode()) + " (ожидается true для равных объектов)");

        System.out.println("\n   Тестирование clone():");
        ArrayTabulatedFunction func1Clone = (ArrayTabulatedFunction) func1.clone();
        System.out.println("   func1: " + func1);
        System.out.println("   clone: " + func1Clone);
        System.out.println("   func1.equals(clone): " + func1.equals(func1Clone));
        System.out.println("   func1 == clone: " + (func1 == func1Clone) + " (ожидается false)");

        func1Clone.setPointY(0, 100);
        System.out.println("\n   После изменения clone.points[0].y = 100:");
        System.out.println("   func1.points[0].y: " + func1.getPointY(0) + " (ожидается 0)");
        System.out.println("   clone.points[0].y: " + func1Clone.getPointY(0) + " (ожидается 100)");
        System.out.println("   func1.equals(clone): " + func1.equals(func1Clone) + " (ожидается false)");
    }

    public static void testTask5Part3() throws Exception {
        System.out.println("\n\n3. ТЕСТИРОВАНИЕ МЕТОДОВ LinkedListTabulatedFunction:");

        FunctionPoint[] points1 = {
                new FunctionPoint(0, 0),
                new FunctionPoint(1, 1),
                new FunctionPoint(2, 4)
        };

        LinkedListTabulatedFunction func1 = new LinkedListTabulatedFunction(points1);
        LinkedListTabulatedFunction func2 = new LinkedListTabulatedFunction(points1);

        ArrayTabulatedFunction arrayFunc = new ArrayTabulatedFunction(points1);

        System.out.println("   LinkedList func1: " + func1.toString());
        System.out.println("   LinkedList func2: " + func2.toString());
        System.out.println("   Array func: " + arrayFunc.toString());

        System.out.println("\n   Тестирование equals():");
        System.out.println("   func1.equals(func2): " + func1.equals(func2) + " (ожидается true)");
        System.out.println("   func1.equals(arrayFunc): " + func1.equals(arrayFunc) + " (ожидается true - сравнение через интерфейс)");
        System.out.println("   arrayFunc.equals(func1): " + arrayFunc.equals(func1) + " (ожидается true - сравнение через интерфейс)");

        System.out.println("\n   Тестирование hashCode():");
        System.out.println("   func1.hashCode(): " + func1.hashCode());
        System.out.println("   func2.hashCode(): " + func2.hashCode());
        System.out.println("   arrayFunc.hashCode(): " + arrayFunc.hashCode());

        System.out.println("   func1.hashCode() == func2.hashCode(): " +
                (func1.hashCode() == func2.hashCode()) + " (ожидается true для равных объектов)");

        System.out.println("\n   Тестирование clone():");
        LinkedListTabulatedFunction func1Clone = (LinkedListTabulatedFunction) func1.clone();
        System.out.println("   func1: " + func1);
        System.out.println("   clone: " + func1Clone);
        System.out.println("   func1.equals(clone): " + func1.equals(func1Clone));
        System.out.println("   func1 == clone: " + (func1 == func1Clone) + " (ожидается false)");

        func1Clone.setPointY(1, 100);
        System.out.println("\n   После изменения clone.points[1].y = 100:");
        System.out.println("   func1.points[1].y: " + func1.getPointY(1) + " (ожидается 1)");
        System.out.println("   clone.points[1].y: " + func1Clone.getPointY(1) + " (ожидается 100)");
        System.out.println("   func1.equals(clone): " + func1.equals(func1Clone) + " (ожидается false)");
    }

    public static void testTask5Part4() throws Exception {
        System.out.println("\n\n4. ДОПОЛНИТЕЛЬНЫЕ ТЕСТЫ И СРАВНЕНИЯ:");

        System.out.println("   Тест на согласованность equals() и hashCode():");

        FunctionPoint[][] testPoints = {
                {new FunctionPoint(0, 0), new FunctionPoint(1, 1)},
                {new FunctionPoint(0, 0), new FunctionPoint(1, 1.001)},
                {new FunctionPoint(0, 0), new FunctionPoint(1, 1)}
        };

        ArrayTabulatedFunction[] functions = new ArrayTabulatedFunction[3];
        for (int i = 0; i < 3; i++) {
            functions[i] = new ArrayTabulatedFunction(testPoints[i]);
        }

        System.out.println("   func0.hashCode(): " + functions[0].hashCode());
        System.out.println("   func1.hashCode(): " + functions[1].hashCode());
        System.out.println("   func2.hashCode(): " + functions[2].hashCode());

        System.out.println("   func0.equals(func1): " + functions[0].equals(functions[1]) +
                " (ожидается false из-за небольшого изменения)");
        System.out.println("   func0.equals(func2): " + functions[0].equals(functions[2]) +
                " (ожидается true)");
        System.out.println("   func0.hashCode() == func2.hashCode(): " +
                (functions[0].hashCode() == functions[2].hashCode()) + " (ожидается true)");

        System.out.println("\n   Тест на хэш-код с нулевой точкой:");

        ArrayTabulatedFunction funcWithZero = new ArrayTabulatedFunction(
                new FunctionPoint[]{new FunctionPoint(-1, 1), new FunctionPoint(0, 0), new FunctionPoint(1, 1)}
        );

        ArrayTabulatedFunction funcWithoutZero = new ArrayTabulatedFunction(
                new FunctionPoint[]{new FunctionPoint(-1, 1), new FunctionPoint(1, 1)}
        );

        System.out.println("   funcWithZero: " + funcWithZero);
        System.out.println("   funcWithoutZero: " + funcWithoutZero);
        System.out.println("   funcWithZero.hashCode(): " + funcWithZero.hashCode());
        System.out.println("   funcWithoutZero.hashCode(): " + funcWithoutZero.hashCode());
        System.out.println("   Хэши разные: " + (funcWithZero.hashCode() != funcWithoutZero.hashCode()));
    }
}