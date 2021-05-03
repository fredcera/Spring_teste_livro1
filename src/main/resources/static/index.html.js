$(document).ready(function (){
   var option = {
       url: function (filtro) {
           return '/api/find/';
       },
       getValue: function (element) {
           valorPadrão = " "

           if (element.valor)
               valorPadrão = "( default: " + element.valor + ") "

           return "[" + element.nome + "] <i>" + element.categoria + " </i> - <b>" + element.nome + "</b> " + valorPadrao + " - " + element.descricao;
       },

       ajaxSettings: {
           dataType: 'json',
           method: 'GET',
           data: {}
       },

       preparePostData: function (data) {
           data.filtro = $('#search').val();
           return data;
       },
       theme: "square",
       list: {
           maxNumberOfElements: 15
       },
       requestDelay: 400

   };

   $('#search').easyAutocomplete(option);

});