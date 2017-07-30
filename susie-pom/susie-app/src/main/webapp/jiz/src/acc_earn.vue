<template>  
    <div class="wrapper">
        <div class="acc">
            <div style="height: 80px; width: 100%; background-color: #48c9bf; border-radius: 10px; margin-top: 40px;">
              <text style="text-align: center;font-size:50px;line-height:80px;">记账本</text>
            </div>
            <div class="acc-type">
              <div class="acc-type-head">
                <text class="acc-type-head-text">收入：{{totalAmount}} 元</text>
              </div>
              <div class="acc-type-body">
                <div class="acc-type-body-row">
                  <text class="acc-type-body-row-text">微信：</text>
                  <input class="acc-type-body-row-input" type="number" autofocus="true" value="" @input="onInput"/>
                  <text class="acc-type-body-row-text">支付宝：</text>
                  <input class="acc-type-body-row-input" type="number" value="" @change="onChange"/>
                </div>
                <div class="acc-type-body-row">
                  <text class="acc-type-body-row-text">卡：</text>
                  <input class="acc-type-body-row-input" type="number" value=""/>
                  <text class="acc-type-body-row-text">其他：</text>
                  <input class="acc-type-body-row-input" type="number" value=""/>
                </div>
                <div class="acc-type-body-row">
                  <text class="acc-type-body-row-text">备注：</text>
                  <textarea class="acc-type-body-row-textarea" value=""/>
                </div>
              </div>
            </div>
            <div class="acc-button" style="background-color: #48c9bf; border-radius: 10px; margin-top: 10px;">
              <text class="acc-button-text">提交</text>
            </div>
            <div class="acc-button">
              <text class="acc-button-text">支出</text>
              <div style="width:100px;"></div>
              <text class="acc-button-text">债务</text>
            </div>
        </div> 
    </div>  
</template>  
<script>  
    module.exports = {
        data:{  
            totalAmount:''，
            earnWx:'',
            earnZfb:'',
            earnCard:'',
            earnOther:''
        },  
        methods:{
            onInput:function(event){
              this.totalAmount = event.value;
              console.log('totalAmount', this.totalAmount);
            },
            onChange:function(event){
              this.totalAmount = this.totalAmount + event.value;
              console.log('totalAmount', this.totalAmount);
            }
        }
    }  
</script> 
<style>  
    .wrapper {  
        position: absolute;  
        top: 0;  
        right: 0;  
        bottom: 0;  
        left: 0;  
    }  
    .acc{
        margin-top: 5px;  
    }
    .acc-button{
        height: 80px; 
        width: 100%;
        margin-top: 50px;
        flex-direction: row;
        justify-content: center;
    }
    .acc-button-text{
        width: 200px;
        text-align: center;
        font-size:50px;
        line-height:80px;
        background-color: #48c9bf;
        border-radius: 10px;
    }
    .acc-type{
      border-width: 2px;
      border-color: #48c9bf;
      margin-top: 10px;
    }
    .acc-type-head{
      border-bottom-width: 2px;
      border-bottom-style: dashed;
      border-bottom-color: red;
    }
    .acc-type-head-text{
      font-size: 45px;
    }
    .acc-type-body{
      margin: 15px;
    }
    .acc-type-body-row{
      margin: 5px;
      flex-direction: row;
    }
    .acc-type-body-row-text{
      height: 80px;
      width: 160px;
      font-size: 40px;
      text-align: end;
      line-height: 80px;
    }
    .acc-type-body-row-input {  
        font-size: 40px;  
        height: 80px;  
        width: 150px;
        margin-right: 15px;
        padding-left: 5px;
        border-width:2px;  
        border-color: #48c9bf;  
        border-radius:10px;  
        outline: none;
    }
    .acc-type-body-row-textarea{
      font-size: 40px;
      height: 180px;
      width: 477px;
      padding-left: 5px;
      border-width: 2px;
      border-color: #48c9bf;
      border-radius:10px;
    }
</style>