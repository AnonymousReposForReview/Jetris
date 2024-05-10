package tests.javafuzzer4;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Tue Aug 29 20:59:33 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3434336592979865659L;
    public static float fFld=-42.908F;
    public static boolean bFld=true;
    public static volatile short sFld=18479;

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(long l, int i9) {

        int i10=-47, i11=-23919, i12=31, i13=192, i14=11, i15=8, iArr[]=new int[N];
        short s=-24995;
        float f=0.991F;

        FuzzerUtils.init(iArr, 1);

        for (i10 = 5; 188 > i10; i10++) {
            i9 += (i10 * i9);
            iArr[i10 - 1] *= i11;
            for (i12 = 1; i12 < 9; ++i12) {
                i13 -= (int)1.104F;
                for (i14 = 1; i14 < 2; i14++) {
                    s += (short)(i14 * i14);
                    i9 += (((i14 * i14) + l) - l);
                    i13 = i12;
                    iArr[i14 - 1] = (int)-3789805813L;
                    i11 += i15;
                }
                i15 += (((i12 * i10) + i11) - f);
                i11 += i15;
                i13 += (i12 * i12);
                l = -179;
            }
        }
        vMeth2_check_sum += l + i9 + i10 + i11 + i12 + i13 + i14 + i15 + s + Float.floatToIntBits(f) +
            FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth1(int i7) {

        int i8=40, i16=9, i17=35, i18=14, i19=64414, iArr1[]=new int[N];
        byte by=-88;
        double d=0.8830;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)30845);
        FuzzerUtils.init(iArr1, -4);

        i7 %= (int)((--i7) | 1);
        i8 = 1;
        while (++i8 < 135) {
            vMeth2(Test.instanceCount, i8);
            i7 += i8;
            sArr[i8 + 1] += (short)i8;
            for (i16 = 1; i16 < 12; ++i16) {
                for (i18 = 1; 2 > i18; i18++) {
                    i17 = i19;
                    by += (byte)i18;
                    iArr1[i18 - 1] -= i19;
                    Test.fFld = (float)d;
                    i7 = (int)Test.fFld;
                    i19 += (i18 * i18);
                    i19 += i18;
                    Test.instanceCount &= i18;
                }
            }
        }
        vMeth1_check_sum += i7 + i8 + i16 + i17 + i18 + i19 + by + Double.doubleToLongBits(d) +
            FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(int i2, int i3, int i4) {

        int i5=-8, i6=-6, i20=-63, i21=28998, iArr2[]=new int[N];
        double d1=0.128475;
        boolean b=false;

        FuzzerUtils.init(iArr2, -3892);

        if (b) {
            i5 = 1;
            do {
                i3 += i5;
                i6 = 1;
                do {
                    i3 += (int)(Test.instanceCount++);
                    vMeth1(i2);
                    i3 *= i4;
                    for (i20 = 1; i20 < 1; i20++) {
                        Test.fFld += Test.instanceCount;
                        i21 *= i4;
                        iArr2[i20 - 1] += i4;
                        i2 = -74;
                        i4 -= (int)d1;
                        iArr2[i5] ^= (int)Test.instanceCount;
                    }
                    i4 += i6;
                } while (++i6 < 5);
            } while (++i5 < 332);
        }
        vMeth_check_sum += i2 + i3 + i4 + i5 + i6 + i20 + i21 + Double.doubleToLongBits(d1) + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        int i=-2, i1=144, i22=50859, i23=-165, i24=9, i25=98, i26=-248, i27=-32411, i28=-5, i29=43096, i30=-38570,
            iArr3[]=new int[N];
        double d2=2.380;
        long l1=2862440064L, lArr[]=new long[N];
        byte by1=-123;
        float fArr[][]=new float[N][N];

        FuzzerUtils.init(lArr, -195088989708355791L);
        FuzzerUtils.init(iArr3, 61621);
        FuzzerUtils.init(fArr, 0.306F);

        for (i = 5; 216 > i; i++) {
            i1 *= (int)lArr[i + 1];
        }
        vMeth(14, i22, i1);
        d2 -= d2;
        switch (((i >>> 1) % 1) + 87) {
        case 87:
            d2 -= i22;
            for (i23 = 9; i23 < 214; i23++) {
                Test.bFld = true;
                Test.fFld %= (i24 | 1);
                for (l1 = 7; l1 < 122; ++l1) {
                    double d3=1.64045;
                    Test.instanceCount = by1;
                    i1 += (int)(l1 * l1);
                    d3 = i23;
                    i24 = 19383;
                }
                Test.fFld = -13268;
            }
            i24 *= (int)-1.868F;
            break;
        default:
            for (i26 = 14; i26 < 229; ++i26) {
                i24 -= (int)Test.instanceCount;
                for (i28 = 117; 5 < i28; i28 -= 3) {
                    iArr3[i26 - 1] <<= i;
                    iArr3[i28] -= i;
                    Test.fFld *= i27;
                    Test.instanceCount = l1;
                }
                Test.sFld = (short)i29;
            }
            i30 = 1;
            while (++i30 < 217) {
                Test.sFld += (short)(i30 * i);
                i27 += (((i30 * i25) + i1) - i29);
                Test.instanceCount += (i30 - Test.instanceCount);
                Test.instanceCount = i28;
                fArr[i30][i30 + 1] -= Test.fFld;
            }
        }


    }
    public static void main(String[] strArr) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr);
            }
         } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
         }
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
