/**
 * Created by Administrator on 2017/6/6.
 */
actionApp.directive('dataPicker',function () {
    return {
        restrict:'AC',
        link:function (scope,elem,attrs) {
            elem.datepicker();
        }
    }
})