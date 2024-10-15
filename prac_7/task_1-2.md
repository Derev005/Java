# Задание №1

Создайте класс `Triangle` для представления треугольников, который порождается от класса `GeometricObject`.
Напишите клиент этих классов — программу, которая запрашивает у пользователя ввести три стороны треугольника, **цвет** и **логическое значение** для указания _закрашен ли треугольник_. Программа должна создавать **объект типа** `Triangle` с указанными сторонами и присваивать значения свойствам цвет `color` и заливка `isFilled` с помощью этих входных данных. Программа должна отображать площадь `area`, периметр `perimeter`, **цвет**, а также **true** или **false** для указания, закрашен треугольник или нет.

Класс **Triangle** должен содержать:
* Три поля данных типа double с именами `side1`, `side2` и `side3` и с заданными по умолчанию значениями, равными **1.0**, для обозначения трех сторон треугольника.
* Безаргументный конструктор, который создает треугольник с заданными по умолчанию значениями.
* Конструктор, который создает треугольник с `side1`, `side2` и `side3`.
* Getter-методы для всех трех полей данных.
* Метод с именем `getArea()`, который возвращает площадь этого треугольника.
* Метод с именем `getPerimeter()`, который возвращает периметр этого треугольника.
* Метод с именем `toString()`, который возвращает строковое описание треугольника.

Формулы для вычисления площади треугольника:
$$s = (side1 + side2 + side3)/2$$
$$area\sqrt{s(s-side1)(s-side2)(s-side3)}$$

где $s$ — полупериметр, а $area$ — площадь треугольника.

Метод `toString()` должен быть реализован следующим образом:
```JAVA
return "Треугольник: сторона1 = " + side1 + " сторона2 = " + side2 +
  " сторона3 = " + side3;
```

# Задание №2
В треугольнике сумма длин любых двух сторон больше длины третьей стороны.
Класс `Triangle` должен удовлетворять этому правилу.
Создайте класс `IllegalTriangleException` и измените конструктор класса `Triangle`, чтобы выбросить объект типа `IllegalTriangleException`, если треугольник создан со сторонами, нарушающими это правило, следующим образом:
```JAVA
/** Создает треугольник с указанными сторонами */
public Triangle(double side1, double side2, double side3)
  throws IllegalTriangleException {
  // Тут надо написать реализацию исключения
}
```