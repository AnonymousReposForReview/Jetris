package tests.javafuzzer3319;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 05:52:17 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=8583923016313330066L;
    public static short sFld=-5774;
    public boolean bFld=true;

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i3, int i4, int i5) {

        int i6=33573, i7=6, i8=-10, iArr1[][]=new int[N][N];
        float f=20.775F;
        byte by=-76;

        FuzzerUtils.init(iArr1, 242);

        i4 = i3;
        iArr1[(i4 >>> 1) % N][(i4 >>> 1) % N] <<= -36;
        iArr1[(i5 >>> 1) % N][(i5 >>> 1) % N] = i3;
        for (i6 = 330; i6 > 19; --i6) {
            f += -225;
            iArr1[i6][i6] -= (int)-39L;
            i3 = (int)-35711L;
            iArr1[i6][i6 + 1] = (int)f;
            i8 = 1;
            do {
                double d=-2.57953;
                d -= 0;
                Test.instanceCount >>= i7;
                Test.instanceCount += (i8 ^ i7);
                i5 = -13;
                by = (byte)Test.instanceCount;
                Test.instanceCount += (long)f;
            } while (++i8 < 5);
        }
        vMeth1_check_sum += i3 + i4 + i5 + i6 + i7 + Float.floatToIntBits(f) + i8 + by + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(int i2) {

        long l=108L;
        int i9=-21737, i10=-112, i11=-133, iArr2[]=new int[N];
        float f1=-2.746F, fArr[]=new float[N];
        boolean b2=false, bArr[]=new boolean[N];
        double d1=36.126832, dArr[]=new double[N];

        FuzzerUtils.init(fArr, -116.650F);
        FuzzerUtils.init(dArr, 120.43261);
        FuzzerUtils.init(iArr2, 25645);
        FuzzerUtils.init(bArr, true);

        switch ((((i2 * i2) >>> 1) % 7) + 43) {
        case 43:
            vMeth1(i2, -3, i2);
            i2 = i2;
            fArr[(i2 >>> 1) % N] -= Test.instanceCount;
            break;
        case 44:
            for (l = 14; l < 384; ++l) {
                if (b2) {
                    for (i10 = 1; i10 < 5; i10++) {
                        Test.instanceCount = 9;
                        dArr[(int)(l)] = i10;
                        switch (((i2 >>> 1) % 4) + 27) {
                        case 27:
                            switch ((i10 % 1) + 1) {
                            case 1:
                            default:
                                i11 = (int)l;
                                Test.sFld += (short)i10;
                            }
                            break;
                        case 28:
                            Test.instanceCount *= (long)f1;
                            i9 -= i2;
                            break;
                        case 29:
                            b2 = b2;
                            break;
                        case 30:
                        }
                    }
                } else {
                    f1 -= Test.instanceCount;
                }
            }
        case 45:
            iArr2[(i11 >>> 1) % N] = -4441;
            break;
        case 46:
            i9 = (int)-31566L;
            break;
        case 47:
            iArr2[(-204 >>> 1) % N] += i2;
        case 48:
        case 49:
            d1 *= i11;
        default:
            bArr[(i9 >>> 1) % N] = false;
        }
        vMeth_check_sum += i2 + l + i9 + i10 + i11 + Float.floatToIntBits(f1) + (b2 ? 1 : 0) +
            Double.doubleToLongBits(d1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr2) +
            FuzzerUtils.checkSum(bArr);
    }

    public static long lMeth(boolean b, boolean b1, int i1) {

        float f2=-33.975F;
        double d2=0.123365, d3=-1.97422;
        int i12=-8, i13=0, iArr3[]=new int[N];

        FuzzerUtils.init(iArr3, 6258);

        Test.instanceCount >>= (((i1 - i1) & (-(i1--))) * Math.abs(Test.instanceCount));
        i1 |= (int)(Test.instanceCount--);
        Test.instanceCount = 22752;
        vMeth(i1);
        i1 += (int)f2;
        i1 = -65;
        Test.instanceCount = i1;
        for (d2 = 13; d2 < 323; d2++) {
            switch ((int)((d2 % 4) + 47)) {
            case 47:
                i1 += (int)(((d2 * i12) + i1) - i12);
                i12 += (int)((long)d2 | i1);
                break;
            case 48:
                for (d3 = 1; d3 < 5; ++d3) {
                    b1 = true;
                    i12 >>= i12;
                    iArr3[(int)(d3 - 1)] *= i12;
                }
                break;
            case 49:
                i1 -= 2;
            case 50:
            default:
                Test.instanceCount = i1;
            }
        }
        long meth_res = (b ? 1 : 0) + (b1 ? 1 : 0) + i1 + Float.floatToIntBits(f2) + Double.doubleToLongBits(d2) + i12
            + Double.doubleToLongBits(d3) + i13 + FuzzerUtils.checkSum(iArr3);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-53, i14=0, i15=-12, i16=-224, i17=8, i18=-47611, i19=213, i20=25826, iArr[]=new int[N];
        float f3=-110.63F;
        double d4=1.93780;
        long l1=-180L, lArr[]=new long[N];
        byte byArr[]=new byte[N];

        FuzzerUtils.init(iArr, -124);
        FuzzerUtils.init(lArr, 5340416757494592322L);
        FuzzerUtils.init(byArr, (byte)112);

        i = (int)(Test.instanceCount << (i--));
        iArr[(i >>> 1) % N] -= 0;
        iArr[(i >>> 1) % N] += (int)lMeth(bFld, bFld, i);
        lArr[(i >>> 1) % N] = 113;
        i += i;
        Test.instanceCount *= 65L;
        i ^= i;
        i |= i;
        for (i14 = 370; i14 > 17; i14 -= 2) {
            f3 = (float)-61.106696;
            for (i16 = 5; i16 < 143; i16++) {
                Test.instanceCount += (long)d4;
                bFld = bFld;
                for (i18 = 1; i18 < 2; i18++) {
                    i19 <<= (int)5596134488252499502L;
                    Test.instanceCount += i18;
                    Test.instanceCount = Test.instanceCount;
                    byArr[(i14 >>> 1) % N] = (byte)f3;
                }
                Test.instanceCount += i19;
                iArr[i14 + 1] *= i16;
                switch (((i14 % 1) * 5) + 83) {
                case 84:
                    i19 += i16;
                    break;
                }
                f3 += (28692 + (i16 * i16));
                iArr[i16 - 1] >>>= (int)-2L;
                i >>= (int)Test.instanceCount;
            }
        }
        Test.instanceCount = (long)d4;
        d4 += Test.instanceCount;
        for (l1 = 2; l1 < 197; ++l1) {
            Test.instanceCount = -41707;
            d4 = i14;
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}