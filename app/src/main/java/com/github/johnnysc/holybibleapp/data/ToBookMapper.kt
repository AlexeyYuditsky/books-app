package com.github.johnnysc.holybibleapp.data

import com.github.johnnysc.holybibleapp.core.Abstract

/**
 * @author Asatryan on 26.06.2021
 **/
interface ToBookMapper : Abstract.Mapper {

    fun map(id: Int, name: String): BookData

    class Base : ToBookMapper {
        override fun map(id: Int, name: String) = BookData(id, name)
    }
}