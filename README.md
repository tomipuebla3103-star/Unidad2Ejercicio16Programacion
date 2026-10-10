<img width="507" height="339" alt="WhatsApp Image 2026-10-05 at 23 47 56" src="https://github.com/user-attachments/assets/ea9d27f8-92d5-4d5e-8f78-f26bda6ef350" />

El Sistema de Reservas de Cine y Salas

 Descripción
Este proyecto consiste en un sistema en Java que permite reservar butacas de una sala de cine. La plataforma de reservas envía una solicitud a la sala para bloquear las butacas seleccionadas y evitar que sean reservadas nuevamente.

Clases
- **Butaca:** almacena la fila, el número y el estado de disponibilidad de cada asiento.
- **SalaCine:** contiene las butacas de la sala y permite bloquear varias mediante el método `bloquearButacas(List<String> codigosButacas)`.
- **PlataformaReserva:** se encarga de gestionar las solicitudes de los usuarios y comunicarse con la sala para realizar las reservas.

 Funcionamiento
En el `main` se crea una sala con sus butacas y se inicializa la plataforma de reservas. Luego, se simula una reserva de varias butacas. Finalmente, se muestra por consola el estado actualizado de la sala.

 Recorrido del mensaje
1. El programa crea las butacas con sus filas, números y estados de disponibilidad.
2. Se inicializa la sala de cine con todas sus butacas.
3. Se crea la plataforma de reservas asociada a la sala.
4. El usuario selecciona las butacas que desea reservar.
5. La plataforma envía la solicitud a la sala mediante el método `bloquearButacas()`.
6. La sala verifica que las butacas existan y estén disponibles antes de bloquearlas.
7. Finalmente, se muestran por consola las butacas reservadas y las que continúan disponibles.

 Validaciones
El sistema debe comprobar que los códigos de las butacas sean válidos y que estén disponibles antes de bloquearlas. Si una butaca ya está ocupada, no debe permitirse una nueva reserva sobre ella.

Objetivo
Practicar la comunicación entre objetos en Java, el encapsulamiento de la lógica de reservas, el uso de listas y la validación de disponibilidad antes de confirmar una operación.
