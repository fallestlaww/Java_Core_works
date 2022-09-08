package ua.lviv.lgs.first;

public class Robot {
	public static void main(String[] args) {
		Robot r = new Robot("Robot", "я просто працюю");
		Work (); {
			System.out.println("Я " + r.getName() + " -  " + r.getWork());
		}
	}
		private static void Work() {
		
	}
		String name;	
		String work;
		protected Robot(String name, String work) {
			super();
			this.name = name;
			this.work = work;
		}
		
		public void work () {
			System.out.println("Я " + name + " -  " + work);
		}

		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}



		public String getWork() {
			return work;
		}



		public void setWork(String work) {
			this.work = work;
		}

		

		@Override
		public String toString() {
			return "Я " + name + " - "  + work;
		}
	}
		
