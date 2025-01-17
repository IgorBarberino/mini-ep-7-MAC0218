package domain

import domain.criterios.Basico
import domain.criterios.CriterioDeAprovacao
import domain.Boletim
import domain.BoletimFechado

internal class AnalisadorDeAprovacao {

    private lateinit var criterio: CriterioDeAprovacao

    fun defineCriterio(criterio: CriterioDeAprovacao) {
        criterio = criterio
    }
    
    fun fechaBoletim(boletim: Boletim) BoletimFechado {

        return BoletimFechado(mediaEPs=boletim.mediaEPs, mediaMiniEPs=boletim.mediaMiniEPs, criterio.mediaFinal(boletim), criterio.estaAprovado(boletim))
}
