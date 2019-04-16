var listModule = (function (){

    var errorMessage = function(){
        alert("Algo ha fallado en la aplicaicon, pedimos disculpas por lo ocurrido");
    };

    var elements = ["DBSID","DBIP","DBPort","DBUserName","DBPassword","PartitionCount","MinConnection","MaxConnection","PDFPath","AdminEmail"];

    return{
        getProperties : async function () {
            await Promise.resolve(axios.get('/configuration/properties'))
                .then(function (response){
                    for(i=0; i<response.data.length;i++){
                        document.getElementById(elements[i]).innerHTML = JSON.stringify(response.data[i]);
                    }

                })


        }
    }


})();