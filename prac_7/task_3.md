## Задание №3
Спроектируйте новый класс `Triangle`, который наследуется от абстрактного класса `GeometricObject`.
1. Напишите тестовую программу, которая запрашивает у пользователя ввод трёх сторон треугольника, цвета и логического значения для указания заливки.
2. Программа должна создать объект типа `Triangle` с этими сторонами и задать свойства **color** и **filled**, используя введенные пользователем данные.
3. Программа должна отображать **площадь**, **периметр**, **цвет** и значение **true** или **false** для указания заливки.
4. Реализуйте в классе `GeometricObject` интерфейс `Comparable` и определите статический метод `max()` в классе `GeometricObject` для поиска наибольшего из двух объектов типа `GeometricObject`.
5. Проверьте тестовой программой работу метода `max()` для поиска наибольшего из двух кругов и наибольшего из двух прямоугольников.
6. Вернитесь к классу с именем `ComparableCircle`, который наследуется от `Circle` и реализует `Comparable`. Напишите тестовую программу, чтобы найти наибольший из двух экземпляров класса `ComparableCircle` и наибольший между кругом и прямоугольником, используя метод `compareTo()`.