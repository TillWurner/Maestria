from empleados.fixed_employee import FixedEmployee
from empleados.hourly_employee import HourlyEmployee
from empleados.commission_employee import CommissionEmployee
from empleados.freelance_employee import FreelanceEmployee

def print_pays(employees):
    for emp in employees:
        print(f"{emp.__class__.__name__} ({emp.name}) => Pago: ${emp.get_pay():.2f}")

if __name__ == "__main__":
    employees = [
        FixedEmployee("Carlos", 3000),
        HourlyEmployee("Ana", 160, 15),
        CommissionEmployee("Luis", 2000, 500),
        FreelanceEmployee("Marta", 10, 100)
    ]

    print_pays(employees)
