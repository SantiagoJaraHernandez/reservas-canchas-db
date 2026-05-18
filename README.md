# ⚽ Sistema Distribuido de Reservas de Canchas

Proyecto de base de datos para una plataforma web de reservas deportivas utilizando PostgreSQL + Liquibase.

---

# 📌 Arquitectura del Sistema

El sistema está dividido en dos microservicios principales:

## 🔐 Microservicio Auth
Encargado de:

- Usuarios
- Roles
- Permisos
- Sesiones
- Seguridad

---

## 📅 Microservicio Reservas
Encargado de:

- Canchas
- Reservas
- Pagos
- Facturación
- Promociones
- Disponibilidad
- Auditoría
- Notificaciones

---

# 🛠 Tecnologías Utilizadas

- PostgreSQL
- Liquibase
- Docker
- GitFlow
- Spring Boot
- React
- TailwindCSS

---

# 📂 Estructura del Proyecto

```plaintext
reservas-canchas-db
│
├── scripts/
│   └── bk_reservas.sql
│
├── model/
│   ├── MER.png
│   ├── ERD.png
│   └── diagrama-clases.png
│
├── changelog-master.xml
├── changelog-01-create-tables.xml
├── changelog-02-initial-data.xml
│
├── liquibase.properties
│
└── README.md
