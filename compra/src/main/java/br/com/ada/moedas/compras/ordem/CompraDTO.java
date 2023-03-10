package br.com.ada.moedas.compras.ordem;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CompraDTO {
    private Long id;
    private String tipoMoeda;
    private BigDecimal valorMoeda;
    private Integer numeroAgência;

    public static CompraDTO of(Compra compra){
        CompraDTO compraDto = new CompraDTO();
        compraDto.setId(compra.getId());
        compraDto.setTipoMoeda(compra.getTipoMoeda());
        compraDto.setValorMoeda(compra.getValorMoeda());
        compraDto.setNumeroAgência(compra.getNumeroAgência());
        return compraDto;
    }
    public Compra toEntity(){
        Compra compra = new Compra();
        compra.setId(id);
        compra.setTipoMoeda(tipoMoeda);
        compra.setValorMoeda(valorMoeda);
        compra.setNumeroAgência(numeroAgência);
        return compra;
    }
}
