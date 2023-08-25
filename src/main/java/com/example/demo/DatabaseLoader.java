package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

	private final ProductoRepository repositoryI;
	private final VentaRepository repositoryB;
	private final DetalleVentaRepository repositoryN;

	@Autowired
	public DatabaseLoader(
		ProductoRepository repositoryI,
		VentaRepository repositoryB,
		DetalleVentaRepository repositoryN
		) {
		this.repositoryI = repositoryI;
		this.repositoryB = repositoryB;
		this.repositoryN = repositoryN;
	}

	@Override
	public void run(String... strings) throws Exception {

		this.repositoryI.save(new Producto("Laptop HP", 1200.00));
this.repositoryI.save(new Producto("Mouse Logitech", 25.00));
this.repositoryI.save(new Producto("Monitor Dell", 300.00));
this.repositoryI.save(new Producto("Teclado Microsoft", 40.00));
this.repositoryI.save(new Producto("Impresora Epson", 150.00));

Producto laptop = new Producto("Laptop Lenovo", 1000.00);
this.repositoryI.save(laptop);

Producto mouse = new Producto("Mouse Razer", 50.00);
this.repositoryI.save(mouse);

Producto teclado = new Producto("Teclado Corsair", 60.00);
this.repositoryI.save(teclado);

Producto monitor = new Producto("Monitor LG", 250.00);
this.repositoryI.save(monitor);

Venta lunes = new Venta("Lunes");
this.repositoryB.save(lunes);

this.repositoryN.save(new DetalleVenta(lunes, laptop, 2));
this.repositoryN.save(new DetalleVenta(lunes, mouse, 1));

Venta martes = new Venta("Martes");
this.repositoryB.save(martes);

this.repositoryN.save(new DetalleVenta(martes, mouse, 3));
this.repositoryN.save(new DetalleVenta(martes, teclado, 2));

Venta miercoles = new Venta("Miércoles");
this.repositoryB.save(miercoles);

this.repositoryN.save(new DetalleVenta(miercoles, monitor, 2));
this.repositoryN.save(new DetalleVenta(miercoles, laptop, 1));

Venta jueves = new Venta("Jueves");
this.repositoryB.save(jueves);

this.repositoryN.save(new DetalleVenta(jueves, monitor, 2));
this.repositoryN.save(new DetalleVenta(jueves, laptop, 1));

Venta viernes = new Venta("Viernes");
this.repositoryB.save(viernes);

this.repositoryN.save(new DetalleVenta(viernes, monitor, 2));
this.repositoryN.save(new DetalleVenta(viernes, laptop, 1));

Venta sabado = new Venta("Sábado");
this.repositoryB.save(sabado);

this.repositoryN.save(new DetalleVenta(sabado, monitor, 2));
this.repositoryN.save(new DetalleVenta(sabado, laptop, 1));



	}
}