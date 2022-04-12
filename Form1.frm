VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   8580
   ClientLeft      =   120
   ClientTop       =   450
   ClientWidth     =   17055
   LinkTopic       =   "Form1"
   ScaleHeight     =   8580
   ScaleWidth      =   17055
   StartUpPosition =   3  'Windows Default
   Begin VB.CommandButton cmdKraj 
      Caption         =   "Kraj"
      Height          =   615
      Left            =   12000
      TabIndex        =   27
      Top             =   6360
      Width           =   2895
   End
   Begin VB.CommandButton cmdPoruci 
      Caption         =   "Poruci"
      Height          =   615
      Left            =   12000
      TabIndex        =   26
      Top             =   5520
      Width           =   2895
   End
   Begin VB.CommandButton cmdKol4 
      Caption         =   "Kolicina"
      Height          =   495
      Left            =   7440
      TabIndex        =   20
      Top             =   6240
      Width           =   2775
   End
   Begin VB.Frame Frame4 
      Caption         =   "Dodatna oprema"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.5
         Charset         =   238
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   2415
      Left            =   7440
      TabIndex        =   19
      Top             =   3720
      Width           =   2775
      Begin VB.CheckBox Check4 
         Caption         =   "Kais za harmoniku 25 KM"
         Height          =   255
         Left            =   120
         TabIndex        =   24
         Top             =   1800
         Width           =   2175
      End
      Begin VB.CheckBox Check3 
         Caption         =   "Stolica za klavir 130 KM"
         Height          =   375
         Left            =   120
         TabIndex        =   23
         Top             =   1320
         Width           =   2175
      End
      Begin VB.CheckBox Check2 
         Caption         =   "Trzalica 1 KM"
         Height          =   255
         Left            =   120
         TabIndex        =   22
         Top             =   960
         Width           =   2295
      End
      Begin VB.CheckBox Check1 
         Caption         =   "Zice za gitaru 12 KM"
         Height          =   375
         Left            =   120
         TabIndex        =   21
         Top             =   480
         Width           =   2295
      End
   End
   Begin VB.CommandButton cmdKol3 
      Caption         =   "Kolicina"
      Height          =   495
      Left            =   7440
      TabIndex        =   18
      Top             =   2640
      Width           =   2775
   End
   Begin VB.Frame Frame3 
      Caption         =   "Harmonike"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.5
         Charset         =   238
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   2055
      Left            =   7440
      TabIndex        =   13
      Top             =   480
      Width           =   2775
      Begin VB.OptionButton Option13 
         Caption         =   "Alacran AL3112 1440 KM"
         Height          =   255
         Left            =   120
         TabIndex        =   17
         Top             =   1680
         Width           =   2415
      End
      Begin VB.OptionButton Option12 
         Caption         =   "Hohner Panther GCF 1050 KM"
         Height          =   255
         Left            =   120
         TabIndex        =   16
         Top             =   1320
         Width           =   2535
      End
      Begin VB.OptionButton Option11 
         Caption         =   $"Form1.frx":0000
         Height          =   375
         Left            =   120
         TabIndex        =   15
         Top             =   840
         Width           =   2535
      End
      Begin VB.OptionButton Option10 
         Caption         =   "Startone C-Handle 1400 KM"
         Height          =   375
         Left            =   120
         TabIndex        =   14
         Top             =   480
         Width           =   2535
      End
   End
   Begin VB.CommandButton cmdKol2 
      Caption         =   "Kolicina"
      Height          =   495
      Left            =   360
      TabIndex        =   12
      Top             =   6240
      Width           =   2895
   End
   Begin VB.Frame Frame2 
      Caption         =   "Klavir"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.5
         Charset         =   238
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   2295
      Left            =   360
      TabIndex        =   7
      Top             =   3840
      Width           =   2895
      Begin VB.OptionButton Option9 
         Caption         =   "Shigeru Kawai SK 190000 KM"
         Height          =   255
         Left            =   120
         TabIndex        =   11
         Top             =   1800
         Width           =   2655
      End
      Begin VB.OptionButton Option8 
         Caption         =   "SnS A-195 85000 KM"
         Height          =   255
         Left            =   120
         TabIndex        =   10
         Top             =   1320
         Width           =   2535
      End
      Begin VB.OptionButton Option7 
         Caption         =   "Yamaha P 116 M 13000 KM"
         Height          =   375
         Left            =   120
         TabIndex        =   9
         Top             =   840
         Width           =   2655
      End
      Begin VB.OptionButton Option6 
         Caption         =   "Yamaha GC 1 M PE 15000 KM"
         Height          =   255
         Left            =   120
         TabIndex        =   8
         Top             =   480
         Width           =   2535
      End
   End
   Begin VB.CommandButton cmdKol1 
      Caption         =   "Kolicina"
      Height          =   495
      Left            =   360
      TabIndex        =   6
      Top             =   3000
      Width           =   2895
   End
   Begin VB.Frame Frame1 
      Caption         =   "Gitare"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.5
         Charset         =   238
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   2535
      Left            =   360
      TabIndex        =   0
      Top             =   360
      Width           =   2895
      Begin VB.OptionButton Option5 
         Caption         =   "Ibanez RGA42FM 900 KM"
         Height          =   255
         Left            =   240
         TabIndex        =   5
         Top             =   2160
         Width           =   2535
      End
      Begin VB.OptionButton Option4 
         Caption         =   "Yamaha RGX121Z 750 KM"
         Height          =   375
         Left            =   240
         TabIndex        =   4
         Top             =   1680
         Width           =   2535
      End
      Begin VB.OptionButton Option3 
         Caption         =   "Fender Telecaster 2350 KM"
         Height          =   255
         Left            =   240
         TabIndex        =   3
         Top             =   1320
         Width           =   2535
      End
      Begin VB.OptionButton Option2 
         Caption         =   "Fender Stratocaster 2200 KM"
         Height          =   375
         Left            =   240
         TabIndex        =   2
         Top             =   840
         Width           =   2535
      End
      Begin VB.OptionButton Option1 
         Caption         =   "Gibson SG Standard 3000 KM"
         Height          =   375
         Left            =   240
         TabIndex        =   1
         Top             =   480
         Width           =   2535
      End
   End
   Begin VB.Image Image3 
      Height          =   1815
      Left            =   4080
      Stretch         =   -1  'True
      Top             =   5280
      Width           =   2655
   End
   Begin VB.Image Image2 
      Height          =   1815
      Left            =   4080
      Stretch         =   -1  'True
      Top             =   2760
      Width           =   2655
   End
   Begin VB.Image Image1 
      Height          =   1695
      Left            =   4080
      Stretch         =   -1  'True
      Top             =   480
      Width           =   2655
   End
   Begin VB.Label Label8 
      Height          =   255
      Left            =   12240
      TabIndex        =   34
      Top             =   4800
      Width           =   3375
   End
   Begin VB.Label Label7 
      Height          =   255
      Left            =   12240
      TabIndex        =   33
      Top             =   4320
      Width           =   3375
   End
   Begin VB.Label Label6 
      Height          =   375
      Left            =   12240
      TabIndex        =   32
      Top             =   3720
      Width           =   3255
   End
   Begin VB.Label Label5 
      Height          =   255
      Left            =   12240
      TabIndex        =   31
      Top             =   3240
      Width           =   3135
   End
   Begin VB.Label Label4 
      Height          =   495
      Left            =   12240
      TabIndex        =   30
      Top             =   2520
      Width           =   3015
   End
   Begin VB.Label Label3 
      Height          =   495
      Left            =   12360
      TabIndex        =   29
      Top             =   1800
      Width           =   2775
   End
   Begin VB.Label Label2 
      Height          =   375
      Left            =   12360
      TabIndex        =   28
      Top             =   1080
      Width           =   2655
   End
   Begin VB.Label Label1 
      Caption         =   "Proizvodi koje ste narucili:"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   17.25
         Charset         =   238
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   555
      Left            =   11760
      TabIndex        =   25
      Top             =   360
      Width           =   4785
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Check1_Click()
cmdKol4.Enabled = True
ime4 = Check1.Caption
End Sub

Private Sub Check2_Click()
ime5 = Check2.Caption
cmdKol4.Enabled = True
End Sub

Private Sub Check3_Click()
ime6 = Check3.Caption
cmdKol4.Enabled = True
End Sub

Private Sub Check4_Click()
ime7 = Check4.Caption
cmdKol4.Enabled = True
End Sub

Private Sub cmdKol1_Click()
kola = InputBox("Koliko izabranih proizvoda ocete?")
Label2.Caption = ime1 & " " & kola & " kom"
End Sub

Private Sub cmdKol2_Click()
kolb = InputBox("Koliko izabranih proizvoda ocete?")
Label3.Caption = ime2 & " " & kolb & " kom"
End Sub

Private Sub cmdKol3_Click()
kolc = InputBox("Koliko izabranih proizvoda ocete?")
Label4.Caption = ime3 & " " & kolc & " kom"
End Sub

Private Sub cmdKol4_Click()
If Check1 = 1 Then
    check1kol = InputBox("Koliko " + Check1.Caption + " ocete?")
    ch1 = 12
    cijch1 = ch1 * check1kol
    Label5.Caption = ime4
    Else
    ch1 = 12
    cijch1 = cijch1 - ch1 * check1kol
    End If
    
If Check2 = 1 Then
    check2kol = InputBox("Koliko " + Check2.Caption + " ocete?")
    ch2 = 1
    cijch2 = ch2 * check2kol
    Label6.Caption = ime5
    Else
    ch2 = 12
    cijch2 = cijch2 - ch2 * check2kol
    End If
    
If Check3 = 1 Then
    check3kol = InputBox("Koliko " + Check3.Caption + " ocete?")
    ch3 = 130
    cijch3 = ch3 * check3kol
    Label7.Caption = ime6
    Else
    ch3 = 12
    cijch3 = cijch3 - ch3 * check3kol
    End If
    
If Check4 = 1 Then
    check4kol = InputBox("Koliko " + Check4.Caption + " ocete?")
    ch4 = 25
    cijch4 = ch4 * check4kol
    Label8.Caption = ime7
    Else
    ch4 = 12
    cijch4 = cijch4 - ch4 * check4kol
    End If
    
    
End Sub

Private Sub cmdKraj_Click()
End
End Sub

Private Sub cmdPoruci_Click()
ukupno = a * kola + b * kolb + c * kolc + cijch1 + cijch2 + cijch3 + cijch4
MsgBox ("Ukupna cijena je " & ukupno)
End Sub





Private Sub Form_Load()
cmdKol1.Enabled = False
cmdKol2.Enabled = False
cmdKol3.Enabled = False
cmdKol4.Enabled = False
If Check1 = True Then
cmdKol4.Enabled = True
End If
If Check2 = True Then
cmdKol4.Enabled = True
End If
If Check3 = True Then
cmdKol4.Enabled = True
End If
If Check4 = True Then
cmdKol4.Enabled = True
End If

End Sub

Private Sub Label2_Click()
Label2.Caption = a
End Sub

Private Sub Option1_Click()
cmdKol1.Enabled = True
a = 3000
ime1 = Option1.Caption
Image1.Picture = LoadPicture(App.Path & "\gitare\gitara1.jpg")
End Sub

Private Sub Option10_Click()
cmdKol3.Enabled = True
c = 1400
ime3 = Option10.Caption
Image3.Picture = LoadPicture(App.Path & "\harmonike\harmonika1.jpg")
End Sub

Private Sub Option11_Click()
cmdKol3.Enabled = True
c = 1150
ime3 = Option11.Caption
Image3.Picture = LoadPicture(App.Path & "\harmonike\harmonika2.jpg")
End Sub

Private Sub Option12_Click()
cmdKol3.Enabled = True
c = 1050
ime3 = Option12.Caption
Image3.Picture = LoadPicture(App.Path & "\harmonike\harmonika3.jpg")
End Sub

Private Sub Option13_Click()
cmdKol3.Enabled = True
c = 1440
ime3 = Option13.Caption
Image3.Picture = LoadPicture(App.Path & "\harmonike\harmonika4.jpg")
End Sub

Private Sub Option2_Click()
cmdKol1.Enabled = True
a = 2200
ime1 = Option2.Caption
Image1.Picture = LoadPicture(App.Path & "\gitare\gitara2.jpg")
End Sub

Private Sub Option3_Click()
cmdKol1.Enabled = True
a = 2350
ime1 = Option3.Caption
Image1.Picture = LoadPicture(App.Path & "\gitare\gitara3.jpg")
End Sub

Private Sub Option4_Click()
cmdKol1.Enabled = True
a = 750
ime1 = Option4.Caption
Image1.Picture = LoadPicture(App.Path & "\gitare\gitara4.jpg")
End Sub

Private Sub Option5_Click()
cmdKol1.Enabled = True
a = 900
ime1 = Option5.Caption
Image1.Picture = LoadPicture(App.Path & "\gitare\gitara5.jpg")
End Sub

Private Sub Option6_Click()
cmdKol2.Enabled = True
b = 15000
ime2 = Option6.Caption
Image2.Picture = LoadPicture(App.Path & "\klaviri\klavir1.jpg")
End Sub

Private Sub Option7_Click()
cmdKol2.Enabled = True
b = 13000
ime2 = Option7.Caption
Image2.Picture = LoadPicture(App.Path & "\klaviri\klavir2.jpg")
End Sub

Private Sub Option8_Click()
cmdKol2.Enabled = True
b = 85000
ime2 = Option8.Caption
Image2.Picture = LoadPicture(App.Path & "\klaviri\klavir3.jpg")
End Sub

Private Sub Option9_Click()
cmdKol2.Enabled = True
b = 190000
ime2 = Option9.Caption
Image2.Picture = LoadPicture(App.Path & "\klaviri\klavir4.jpg")
End Sub
