public class Problema1_EjecutorProducto
{
    public static void main(String[] args)
    {
        Producto producto1 = new Producto(1000, 10);
        Producto producto2 = new Producto(500, 20);
        
        producto1.CalcularDescuento(producto1.precioP, producto1.cantidadP);
        producto1.CalcularPrecioFinal();
        System.out.println(producto1.toString());
        producto2.CalcularDescuento(producto2.precioP, producto2.cantidadP);
        producto2.CalcularPrecioFinal();
        System.out.println(producto1.toString());
    }
}
class Producto 
{
    public double precioP;
    public int cantidadP;
    public double descuento;
    public double precioFinal;
    public double montoDescuento;
    public Producto(){}
    public Producto(double precioP, int cantidadP){
        this.precioP = precioP;
        this.cantidadP = cantidadP;       
    }
    public double CalcularDescuento(double precioP, int cantidadP)
    {
        if (this.precioP >= 1000 && cantidadP >= 10) 
            this.descuento = 10;
        else if (precioP >= 1000)
            this.descuento = 5;
        this.montoDescuento = (this.cantidadP * this.precioP) * (this.descuento / 100); 
        return this.montoDescuento;  
    }
    public double CalcularPrecioFinal()
    {
        this.precioFinal = (this.cantidadP * this.precioP) - this.montoDescuento;
        return precioFinal;
    }
    
    @Override
    public String toString() {
        return "Producto{" + "precioP=" + precioP + ", cantidadP=" + cantidadP + ", descuento=" + descuento + ", precioFinal=" + precioFinal + ", montoDescuento=" + montoDescuento + '}';
    }
    
}
