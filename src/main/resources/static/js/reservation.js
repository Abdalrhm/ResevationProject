var reservationlist;
$(document).ready(function () {
    $("#add").click(addName);
    $("#getresavation").click(getNames);
     reservationlist = $("#resvationform").DataTable();
     getNames();
});

function getNames() {
    $.get("/api/resevation", function (resvations) {
        reservationlist.clear();
       for(i=0; i<resvations.length; i++) {
            const restauRes = resvations[i];
            reservationlist.row.add(
            $(
               '<tr id="row'+restauRes.id+'"><td>'+restauRes.id+ '</td>'+
               '<td>'+restauRes.guestFirstName+'</td>'+
               '<td>'+restauRes.guestLastName+'</td>'+
               '<td>'+restauRes.telefoon+'</td>'+
               '<td>'+restauRes.dateNtime+'</td>'+
               '<td>'+restauRes.numOfTables+'</td>'+
               '<td>'+restauRes.numberOfGuest+'</td>'+
               '<td><button class="btn btn-success" onclick="removeReservation('+restauRes.id+');">Delete</button></td></tr>'
            ));
        }
        reservationlist.draw();

        });
}
//        $("#reservationList button.remove").click(function () {
//            var reservationId = $(this).attr('reservationId');
//            removeReservation(reservationId);
//        }
//    });

function removeReservation(id) {
    $.ajax({
        url: 'api/resevation/' + id,
        type: 'DELETE',
        success: function () {
            getNames();
        },
        error: function () {
            alert('Something went wrong!!');
        }
    });
}
function addName() {

    var newresvation = {
        guestFirstName: $("#guestFirstName").val(),
        guestLastName: $("#guestLastName").val(),
        numOfTables: $("#numOfTables").val(),
        dateNtimel: $("#dateNtime").val(),
        telefoon: $("#telefoon").val(),
        numberOfGuest: $("#numberOfGuest").val(),

    }

    var jsonoject = JSON.stringify(newresvation);
    $.ajax({
        url: "api/resevation/addresvation",
        contentType: "application/json",
        type: "POST",
        data: jsonoject,

        success: function () {
            alert("doen successflly");
            getNames();
        },
        error: function () {
            alert("doen not successflly");
        }
    });
}