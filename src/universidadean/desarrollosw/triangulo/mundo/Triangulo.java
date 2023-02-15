/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad Ean (Bogot� - Colombia)
 * Departamento Tecnolog�as de la Informaci�n
 * Licenciado bajo el esquema Academic Free License version 2.1
 * <p>
 * Unidad de Estudio: Desarrollo de Software
 * Ejercicio: Triangulo
 * Fecha: Agosto 2022
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package universidadean.desarrollosw.triangulo.mundo;

/**
 * Clase que representa un tri�ngulo.
 */
public class Triangulo {

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Primer punto del tri�ngulo.
     */
    private Punto punto1;

    /**
     * Segundo punto del tri�ngulo.
     */
    private Punto punto2;

    /**
     * Tercer punto del tri�ngulo.
     */
    private Punto punto3;

    /**
     * Color de las l�neas.
     */
    private Color colorLineas;

    /**
     * Color del relleno.
     */
    private Color colorRelleno;

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Inicializa el tri�ngulo
     */
    public Triangulo() {
        // Inicializa los puntos

        punto1 = new Punto(200, 50);
        punto2 = new Punto(300, 200);
        punto3 = new Punto(100, 200);

        // Inicializa los colores
        colorRelleno = new Color(60, 168, 56);
        colorLineas = new Color(0, 83, 24);
    }

    /**
     * Retorna el punto 1 del tri�ngulo.
     */
    public Punto darPunto1() {
        return punto1;
    }

    /**
     * Retorna el punto 2 del tri�ngulo.
     */
    public Punto darPunto2() {
        return punto2;
    }

    /**
     * Retorna el punto 3 del tri�ngulo.
     */
    public Punto darPunto3() {
        return punto3;
    }

    /**
     * Retorna el color de las l�neas del tri�ngulo.
     */
    public Color darColorLineas() {
        return colorLineas;
    }

    /**
     * Retorna el color del relleno del tri�ngulo.
     */
    public Color darColorRelleno() {
        return colorRelleno;
    }

    /**
     * Retorna el per�metro del tri�ngulo.
     */

    public class Punto {
        private double x;
        private double y;

        public Punto(double x, double y) {
            this.x = x;
            this.y = y;
        }
        public double darX() {
            return x;
        }
        public double darY() {
            return y;
        }
    public double Distancia(Punto otroPunto) {
        double deltaX = this.x - otroPunto.darX();
        double deltaY = this.y - otroPunto.darY();
        double distancia = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
        return distancia;
        }
    }
    public double darPerimetro() {
        double distancia1a2 = punto1.Distancia(punto2);
        double distancia2a3 = punto2.Distancia(punto3);
        double distancia3a1 = punto3.Distancia(punto1);
        return distancia1a2 + distancia2a3 + distancia3a1;
    }

    /**
     * Retorna el �rea del tri�ngulo, calculada utilizando la formula de Her�n. <br>
     */
    public double darArea() {
        double distancia1a2 = punto1.Distancia(punto2);
        double distancia2a3 = punto2.Distancia(punto3);
        double distancia3a1 = punto3.Distancia(punto1);
        double semiperimetro = darPerimetro() / 2;

        return Math.sqrt(semiperimetro * (semiperimetro - distancia1a2) * (semiperimetro - distancia2a3) * (semiperimetro - distancia3a1));
    }

    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo();
        double perimetro = triangulo.darPerimetro();
        double area = triangulo.darArea();
        System.out.println("El per�metro del tri�ngulo es: " + perimetro);
        System.out.println("El �rea del tri�ngulo es: " + area);
    }

    /**
     * Calcula la altura del tri�ngulo, teniendo en cuenta como base la l�nea entre el punto 1 y 2. <br>
     * Tenga en cuenta que �rea = (Base * Altura) / 2.
     */
    public double darAltura() {
        double base = Distancia(punto2);
        double area = darArea();
        double altura = (2 * area) / base;
        return altura;
    }

    /**
     * Calcula la distancia entre el punto 1 y 2.
     */
    public double calcularLado1() {
        double x1 = punto1.darX();
        double y1 = punto1.darY();
        double x2 = punto2.darX();
        double y2 = punto2.darY();

        // calcula la distancia
        return calcularLado1();
    }

    /**
     * Calcula la distancia entre el punto 2 y 3.
     */
    public double calcularLado2() {
        double x1 = punto2.darX();
        double y1 = punto2.darY();
        double x2 = punto3.darX();
        double y2 = punto3.darY();

        // calcula la distancia
        return calcularLado2();
    }

    /**
     * Calcula la distancia entre el punto 3 y 1.
     */
    public double calcularLado3() {
        double x1 = punto3.darX();
        double y1 = punto3.darY();
        double x2 = punto1.darX();
        double y2 = punto1.darY();

        // calcula la distancia
        return calcularLado3();
    }

    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo();
        double perimetro = triangulo.darPerimetro();
        double area = triangulo.darArea();
        double altura = triangulo.darAltura();
        System.out.println("El per�metro del tri�ngulo es: " + perimetro);
        System.out.println("El �rea del tri�ngulo es: " + area);
        System.out.println("La altura del tri�ngulo es: " + altura);
        System.out.println("La distancia entre el punto 1 y el punto 2 es: " + calcularLado1);


    }
}

    /**
     * Calcula el �ngulo opuesto entre un v�rtice de referencia y los otros dos v�rtices de un tri�ngulo.
     */
    public double calcularAnguloOpuesto(double pX1, double pY1, double pX2, double pY2, double pX3, double pY3) {
        // �ngulo 1
        double angulo1 = Math.atan2(pY2 - pY1, pX2 - pX1);

        // �ngulo 2
        double angulo2 = Math.atan2(pY3 - pY1, pX3 - pX1);

        // Garantiza que la diferencias de �ngulos sea la m�s peque�a.
        if (Math.abs(angulo1 - angulo2) > Math.PI) {
            angulo1 = angulo1 < 0 ? angulo1 + 2.d * Math.PI : angulo1;
            angulo2 = angulo2 < 0 ? angulo2 + 2.d * Math.PI : angulo2;
        }

        // Calcula el �ngulo opuesto
        double anguloOpuesto = (angulo1 + angulo2) / 2.d + Math.PI;
        anguloOpuesto = anguloOpuesto % (2.d * Math.PI);
        return anguloOpuesto;
    }

    /**
     * Cambia el valor de la coordenada X y Y del punto 1.
     */
    public void cambiarPunto1(double pX, double pY) {

    }

    /**
     * Cambia el valor de la coordenada X y Y del punto 2.
     */
    public void cambiarPunto2(double pX, double pY) {

    }

    /**
     * Cambia el valor de la coordenada X y Y del punto 3.
     */
    public void cambiarPunto3(double pX, double pY) {

    }

    /**
     * Cambia el color de relleno del tri�ngulo.
     */
    public void cambiarColorRelleno(int pRojo, int pVerde, int pAzul) {
        colorRelleno.cambiarRojo(pRojo);
        colorRelleno.cambiarVerde(pVerde);
        colorRelleno.cambiarAzul(pAzul);
    }

    /**
     * Cambia el color de la l�neas del tri�ngulo.
     */
    public void cambiarColorLineas(int pRojo, int pVerde, int pAzul) {
        // TODO: Realice el cambio de los colores
    }

    /**
     * Obtener el tipo de tri�ngulo. Este puede ser:
     * - equilatero: los tres lados iguales
     * - isosceles: solo dos lados iguales
     * - escaleno: todos los lados diferentes.
     */
    public String tipo() {
        // TODO: Obtener y retornar el tipo del triangulo
        return "TIPO";
    }

    /**
     * Obtener el �ngulo (en radianes) entre el lado 1 y el lado 2.
     * Use la ley del coseno para tal fin
     */
    public double angulo1() {
        // TODO: Obtener y retornar el �ngulo entre los lado 1 y lado 2
        return 0.0;
    }

    /**
     * Obtener el �ngulo (en radianes) entre el lado 2 y el lado 3.
     * Use la ley del coseno para tal fin
     */
    public double angulo2() {
        // TODO: Obtener y retornar el �ngulo entre los lado 2 y lado 3
        return 0.0;
    }

    /**
     * Obtener el �ngulo (en radianes) entre el lado 1 y el lado 3.
     * Use la ley del coseno para tal fin
     */
    public double angulo3() {
        // TODO: Obtener y retornar el �ngulo entre los lado 1 y lado 3
        return 0.0;
    }

}
