# horus-task
Kod zawiera interfejs IMystructure, któy posiada definicje trzech metod. Metodę findByCode, która zwraca INode i przyjmuje na wejściu
parametr code typu String, Metodę findByRenderer, która zwraca INode i przyjmuje na wejściu
parametr renderer typu String oraz metodę count, która zwraca int. Na podstawie nazw metod i typów zwracanych można wywnioskować, że
zadaniem programu wyszukiwanie węzłów po parametrach code i renderer oraz liczbę występujących węzłów.
Następnie mamy klasę Mystructure, która implementuje wyżej opisany inerfejs oraz zawiera listę typu INode.
Mamy również interfejs Inode, w którym są zdefiniowane dwie metody typu string: getCode i getRenderer, jak również interfejs IcompositeNode
posiadający zdefiniowaną metodę zwracającą listę typu INode i rozszerzający interfejs INode.
W zadaniu nie mam dokładnych informacji  jak dokładnie powinien zachowywać się program, nie wiemy ja powinna zachowywać się metoda 
findByCode, czy fidByRender jeśli atrybut nodes zawiera więcej niż jeden element i jak powinna zachowywać się metoda count jeśli 
zawiera instancję ICompositeNode.W związku z tym, że nie ma konkretnych wytycznych założyłem, że interfejs INode można rozszerzyć i dodałem metodę toStream, która zwraca 
strumień INode i dodatkowo go spłaszcza za pomocą flatmap, co pomoże obsłużyć zagnieżdżone elementy. Implementacja tej metody jest zawarta
w klasie CompositeNode, która rozszerza klasę Node, a implementuje interfejs ICompositeNode.  
