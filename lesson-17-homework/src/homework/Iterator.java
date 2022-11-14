package homework;

public interface Iterator {
	public boolean hasNext();
	public Object next();
}

class Collection {
	private static Number[] array;
	
	Collection(Number [] array) {
		this.array = array;
	}
	
	public class CustomIterator implements Iterator {

		private int count = 0;
		@Override
		public boolean hasNext() {
			return count < array.length;
		}

		@Override
		public Object next() {
			int number = array[count++].intValue();

			if ((number % 2) != 0) {
				return number;
			} else {
				return 0; 
			}
		}
		
	}
	
	public CustomIterator createCustomIterator() {
		return new CustomIterator();
		
	}
	
	public class BackCustomIterator implements Iterator {

		private int count = (array.length-1);
		
		@Override
		public boolean hasNext() {
			return count>=0;
		}

		@Override
		public Object next() {
			return array[count--];
		
	}
	}
	
	public BackCustomIterator createBackCustomIterator() {
		return new BackCustomIterator();
	}
	
	public Iterator AnonimusIterator() {
		return new Iterator() {
			int count = array.length - 3;
			@Override
			public boolean hasNext() {
				return count >=0;
			}

			@Override
			public Object next() {
				int number = array[count].intValue();
				count -= 1;
				if (((number % 2) == 1) || ((number % 2) == -1)) {
					return number;
				} else {
					return number;
				}
			}
			
		};
		
	}
	
	public Iterator LocalIterator() {
		class Four implements Iterator {
			private int count = 1;
			@Override
			public boolean hasNext() {
				return count < array.length;
			}

			@Override
			public Object next() {
				int number = array[count].intValue();
				count += 1;
				if ((number % 2) == 0) {
					return number + 100;
				} else {
					return number;
				}

			}
			
		}
		return new Four();
	}
	
	private static class StaticIterator implements Iterator {
		private int count = 1;

		@Override
		public boolean hasNext() {

			return count < array.length;
		}

		@Override
		public Number next() {
			
			int number = array[count].intValue();
			count += 1;
			if ((number % 2) == 0) {
				int number2 = number + 1;
				return  number2;
			} else {
				return number;
			}

		}

	}

	public static StaticIterator StaticIterator() {
		return new StaticIterator();
	}
}
