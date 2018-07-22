package generics2;

import java.util.ArrayList;

class Fruit implements Eatable{
	public String toString(){
		return "Fruit";
	}
}

class Apple extends Fruit{public String toString(){return "Apple";}} 
class Grape extends Fruit{public String toString(){return "Grape";}}
class Toy{public String toString(){return "Toy";}}

interface Eatable{}

public class Main2 {
	FruitBox<Fruit> fruitBox=new FruitBox<Fruit>();
	FruitBox<Apple> appleBox=new FruitBox<Apple>();
	FruitBox<Grape> grapeBox=new FruitBox<Grape>();
	//FruitBox<Grape> grapeBox2=new FruitBox<Apple>(); 타입 불일치
	fruitBox.add(new Fruit());
}


class FruitBox<T extends Fruit&Eatable> extends Box<T>{}


class Box<T>{
	ArrayList<T> list=new ArrayList<T>();
	void add(T item){list.add(item);}
	T get(int i){return list.get(i);}
	public String toString(){return list.toString();}
}