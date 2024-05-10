package tests.javafuzzer3119;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 02:10:14 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-6941L;
    public static float fFld=0.643F;
    public volatile byte byFld=-91;
    public double dFld=-2.73781;
    public static volatile boolean bFld=false;
    public static double dFld1=86.103810;

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long byMeth_check_sum = 0;

    public static byte byMeth(int i8) {

        int i9=200, i10=-57, i11=7, i12=46, i13=25533, i14=149, iArr[]=new int[N];
        double d1=-94.5984;
        short sArr[]=new short[N];
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(sArr, (short)19060);
        FuzzerUtils.init(iArr, 13);
        FuzzerUtils.init(lArr, -3L);

        for (i9 = 4; 368 > i9; i9 += 2) {
            i8 -= i9;
            if (true) {
                Test.instanceCount -= i8;
                i10 = i8;
                for (i11 = 1; 9 > i11; i11++) {
                    for (i13 = 1; i13 < 2; i13++) {
                        i14 += (((i13 * i12) + Test.fFld) - i14);
                        i8 += i13;
                        i12 += (i13 * i13);
                        sArr[i13 + 1] -= (short)-21666;
                        Test.instanceCount += i13;
                        iArr[i13] = i14;
                        lArr[i9 + 1][i13 - 1] = Test.instanceCount;
                    }
                    d1 *= Test.instanceCount;
                }
            } else {
                Test.fFld = i10;
            }
        }
        long meth_res = i8 + i9 + i10 + i11 + i12 + i13 + i14 + Double.doubleToLongBits(d1) +
            FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public static void vMeth1(int i7, long l) {

        int i15=23455, i16=234, i17=33, i18=-13, i19=15, iArr1[]=new int[N];
        double d2=108.7444;
        float f=2.423F, f1=52.388F;
        boolean b=true;

        FuzzerUtils.init(iArr1, 32428);

        i7 += byMeth(i15);
        Test.fFld *= i7;
        for (d2 = 155; d2 > 1; d2 -= 2) {
            i16 = (int)d2;
            for (f = (float)(d2); f < 20; ++f) {
                for (i18 = 1; i18 < 1; ++i18) {
                    b = b;
                    l = i17;
                    try {
                        i15 = (51044 % i19);
                        i16 = (iArr1[(int)(d2 + 1)] % -1862872573);
                        i7 = (iArr1[(int)(d2)] % i17);
                    } catch (ArithmeticException a_e) {}
                }
                f1 -= i17;
                switch ((int)(((f % 3) * 5) + 3)) {
                case 16:
                    i17 >>= i18;
                    i16 += (int)f;
                    i16 *= i19;
                    i7 *= i17;
                case 13:
                case 6:
                    i17 = i15;
                    break;
                }
            }
        }
        vMeth1_check_sum += i7 + l + i15 + Double.doubleToLongBits(d2) + i16 + Float.floatToIntBits(f) + i17 + i18 +
            i19 + (b ? 1 : 0) + Float.floatToIntBits(f1) + FuzzerUtils.checkSum(iArr1);
    }

    public void vMeth(int i1, int i2) {

        int i3=-237, i4=0, i5=-107, i6=29, i20=53074, i21=-10;
        double d=2.28281;

        for (i3 = 207; i3 > 6; --i3) {
            Test.fFld -= Math.abs(-7423040751753665023L);
            d *= d;
            d *= -53;
            for (i5 = 1; i5 < 8; ++i5) {
                vMeth1(i3, 36L);
                switch (((i3 % 2) * 5) + 56) {
                case 66:
                    Test.fFld += i5;
                    i1 = (int)Test.fFld;
                    break;
                case 62:
                    for (i20 = i5; i20 < 2; i20++) {
                        i1 = 21193;
                        i6 -= (int)Test.instanceCount;
                        i21 -= i1;
                    }
                    break;
                }
                i6 = (int)d;
                i4 &= i6;
            }
        }
        vMeth_check_sum += i1 + i2 + i3 + i4 + Double.doubleToLongBits(d) + i5 + i6 + i20 + i21;
    }

    public void mainTest(String[] strArr1) {

        int i=128, i22=-9, i23=-2158, i24=-48, i25=-96, i26=-212, i27=11651, iArr2[][]=new int[N][N];
        short s=-27491;
        float f2=1.169F, fArr[]=new float[N];

        FuzzerUtils.init(fArr, -74.526F);
        FuzzerUtils.init(iArr2, -230);

        i *= (i << ((8 - (i - 31950)) - (i--)));
        vMeth(i, 77);
        i >>= i;
        i <<= (int)Test.instanceCount;
        fArr[(i >>> 1) % N] -= Test.fFld;
        i >>>= (int)Test.instanceCount;
        i22 = 1;
        while (++i22 < 209) {
            byFld += (byte)i;
            i *= (int)dFld;
            switch ((i22 % 4) + 104) {
            case 104:
                Test.fFld += i22;
                if (Test.bFld) continue;
                for (i23 = i22; i23 < 120; i23++) {
                    for (i25 = 1; i25 > 1; i25--) {
                        i26 += (i25 * i25);
                        i %= (int)(i | 1);
                        iArr2[i22 - 1][i23] <<= i25;
                        Test.fFld += (float)dFld;
                        i26 <<= i22;
                        i26 += (((i25 * i26) + i25) - i);
                    }
                    iArr2[i23 - 1][i23 + 1] -= i26;
                    Test.bFld = false;
                    s += (short)i23;
                    for (f2 = 1; 1 > f2; ++f2) {
                        int i28=9;
                        Test.instanceCount *= i24;
                        Test.dFld1 -= f2;
                        Test.instanceCount <<= i26;
                        if (false) break;
                        i28 &= i;
                        i27 = (int)-1.51350;
                    }
                }
                break;
            case 105:
                iArr2[i22 - 1][i22 + 1] = byFld;
                break;
            case 106:
                i = s;
                break;
            case 107:
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
//DEBUG  byMeth ->  byMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
