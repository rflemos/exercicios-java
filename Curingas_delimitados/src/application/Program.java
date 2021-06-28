

	package application;

	import java.util.ArrayList;
	import java.util.List;

	import entities.Circle;
	import entities.Rectangle;
	import entities.Shape;

	public class Program {

		public static void main(String[] args) {
			
			List<Shape> myShapes = new ArrayList<>();
			myShapes.add(new Rectangle(3.0, 2.0));
			myShapes.add(new Circle(2.0));
			
			
			List<Circle> myCircles = new ArrayList<>();
			myCircles.add(new Circle(2.0));
			myCircles.add(new Circle(3.0));
			
			
			//System.out.println("Total area: " + totalArea(myShapes));
			System.out.println("Total area: " + totalArea(myCircles));
		}
		//public static double totalArea(List<Shape> list)
		
		/*public static double totalArea(List<?> list)// aceitava qualquer tipo de list porem não conseguimos acessar 
		  o valor pois o compilador não sabe se o tipo dos elementos da lista são shape*/
		
		/* public static double totalArea(List<? extends Shape> list)agora conesguimos acessar a lista pois 
		    refereciamos o metodo que aceita qualquer tipo  de lista que extende shape ou seja qualquer tipo de 
		    de um subtipo de shape porem somente consguimos colocar elementos na lista com (list.add())
		    pois os mesmo podem não ser compativeis  com a lista covariancia*/
		public static double totalArea(List<? extends Shape> list) {
			
			double sum = 0.0;
			for (Shape s : list) {
				sum += s.area();
			}
			return sum;
		}
	}


