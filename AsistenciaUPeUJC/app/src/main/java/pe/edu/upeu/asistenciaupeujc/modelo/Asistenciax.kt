package pe.edu.upeu.asistenciaupeujc.modelo

data class Asistenciax(
    val id: Long,
    val fecha: String,
    val horaReg: String,
    val latituda: String,
    val longituda: String,
    val tipo: String,
    val calificacion: Long,
    val cui: String,
    val tipoCui: String,
    val entsal: String,
    val subactasisId: Long,
    val offlinex: String,
    val actividadId: String,
)
