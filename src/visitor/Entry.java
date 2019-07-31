package visitor;

import java.util.Iterator;

import composite.FileTreatmentException;

//elementインターフェースで宣言されている抽象メソッドacceptを実装するのはEntryサブクラスのFileクラスやDorectoryクラス
public abstract class Entry implements Element {

		public abstract String getName();
		public abstract int getSize();

		public Entry add(Entry entry) throws FileTreatmentException{

			throw new FileTreatmentException();

		}

		public Iterator iterator(){

			throw new FileTreatmentException();

		}


		public String toString() {

			return getName() + "(" + getSize() + ")";

		}
}
