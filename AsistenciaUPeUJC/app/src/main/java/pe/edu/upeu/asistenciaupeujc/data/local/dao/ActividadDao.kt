package pe.edu.upeu.asistenciaupeujc.data.local.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import pe.edu.upeu.asistenciaupeujc.modelo.Actividad

@Dao
interface ActividadDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertarActividad(actividad: Actividad)


    //insertar en conjunto
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertarActividades(actividad: List<Actividad>)

    //Modificar

    @Update
    suspend fun modificarActividad(actividad: Actividad)

    //eliminar

    @Delete
    suspend fun eliminarActividad(actividad: Actividad)

    //consultas

    @Query("select * from actividad")
    fun reportarActividad():LiveData<List<Actividad>>

    //otro mas
    @Query("select * from actividad where id=:idx")
    fun busccarActividad(idx: Long): LiveData<Actividad>



}