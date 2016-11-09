BEGIN
   --
   -- Script de actualizacion de parámetros de tareas G0200002
   UPDATE G0200002 SET MCA_VISIBLE = 'S', MCA_OBLIGATORIO = 'S' WHERE COD_CIA = 1 AND COD_TAR = 'MPYEM20040' AND COD_CAMPO = 'JBCOD_CIA'       ;
   UPDATE G0200002 SET MCA_VISIBLE = 'N', MCA_OBLIGATORIO = 'N' WHERE COD_CIA = 1 AND COD_TAR = 'MPYEM20040' AND COD_CAMPO = 'JBCOD_RAMO'      ;
   UPDATE G0200002 SET MCA_VISIBLE = 'S', MCA_OBLIGATORIO = 'S' WHERE COD_CIA = 1 AND COD_TAR = 'MPYEM20040' AND COD_CAMPO = 'JBCOD_TIP_SALIDA';
   UPDATE G0200002 SET MCA_VISIBLE = 'S', MCA_OBLIGATORIO = 'S' WHERE COD_CIA = 1 AND COD_TAR = 'MPYEM20040' AND COD_CAMPO = 'JBFEC_PROCESO'   ;
   UPDATE G0200002 SET MCA_VISIBLE = 'N', MCA_OBLIGATORIO = 'N' WHERE COD_CIA = 1 AND COD_TAR = 'MPYEM20040' AND COD_CAMPO = 'JBNOM_LISTADO'   ;
   UPDATE G0200002 SET MCA_VISIBLE = 'N', MCA_OBLIGATORIO = 'N' WHERE COD_CIA = 1 AND COD_TAR = 'MPYEM20040' AND COD_CAMPO = 'JBNUM_APLI'      ;
   UPDATE G0200002 SET MCA_VISIBLE = 'N', MCA_OBLIGATORIO = 'N' WHERE COD_CIA = 1 AND COD_TAR = 'MPYEM20040' AND COD_CAMPO = 'JBNUM_POLIZA'    ;
   UPDATE G0200002 SET MCA_VISIBLE = 'N', MCA_OBLIGATORIO = 'N' WHERE COD_CIA = 1 AND COD_TAR = 'MPYEM20040' AND COD_CAMPO = 'JBNUM_RIESGO'    ;
   UPDATE G0200002 SET MCA_VISIBLE = 'N', MCA_OBLIGATORIO = 'N' WHERE COD_CIA = 1 AND COD_TAR = 'MPYEM20040' AND COD_CAMPO = 'JBNUM_SPTO'      ;
   UPDATE G0200002 SET MCA_VISIBLE = 'S', MCA_OBLIGATORIO = 'S' WHERE COD_CIA = 1 AND COD_TAR = 'MPYEM20040' AND COD_CAMPO = 'JBTIP_LIS_EM04'  ;
   UPDATE G0200002 SET MCA_VISIBLE = 'S', MCA_OBLIGATORIO = 'S' WHERE COD_CIA = 1 AND COD_TAR = 'MPYEM20040' AND COD_CAMPO = 'JBTIP_LIS_EM05'  ;
   UPDATE G0200002 SET MCA_VISIBLE = 'S', MCA_OBLIGATORIO = 'S' WHERE COD_CIA = 1 AND COD_TAR = 'MPYEM20040' AND COD_CAMPO = 'JBTIP_LIS_EM06'  ;
   UPDATE G0200002 SET MCA_VISIBLE = 'S', MCA_OBLIGATORIO = 'S' WHERE COD_CIA = 1 AND COD_TAR = 'MPYEM20040' AND COD_CAMPO = 'JBTIP_LIS_EM07'  ;
   UPDATE G0200002 SET MCA_VISIBLE = 'S', MCA_OBLIGATORIO = 'S' WHERE COD_CIA = 1 AND COD_TAR = 'MPYEM20040' AND COD_CAMPO = 'JBTIP_LIS_EM12'  ;
   --
EXCEPTION
  WHEN OTHERS THEN
    NULL;
END;
/
EXIT