package tests.javafuzzer1018;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 12:55:11 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=132L;
    public volatile float fFld=39.182F;
    public short sFld=14325;
    public static int iArrFld[][]=new int[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, 187);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i5=-19245, i6=133, i7=2, i8=-3, i9=-20, i10=-9900, i11=-141, iArr[]=new int[N];
        short s=27745;
        float f1=-1.375F;

        FuzzerUtils.init(iArr, -4);

        i5 = 1;
        do {
            Test.instanceCount = i5;
            i6 += (((i5 * i7) + i5) - i6);
            i7 &= i5;
            i6 += (((i5 * i7) + i5) - i6);
            if (i6 != 0) {
                vMeth1_check_sum += i5 + i6 + i7 + i8 + s + i9 + i10 + i11 + Float.floatToIntBits(f1) +
                    FuzzerUtils.checkSum(iArr);
                return;
            }
            i6 = 96;
        } while (++i5 < 130);
        i7 -= i6;
        i8 = 1;
        while (++i8 < 376) {
            s = (short)-12;
            i9 = 1;
            do {
                Test.instanceCount += i9;
                for (i10 = 1; i10 < 1; ++i10) {
                    iArr[i9] = (int)f1;
                    i7 += (int)(-18.244F + (i10 * i10));
                }
            } while (++i9 < 4);
        }
        vMeth1_check_sum += i5 + i6 + i7 + i8 + s + i9 + i10 + i11 + Float.floatToIntBits(f1) +
            FuzzerUtils.checkSum(iArr);
    }

    public int iMeth() {

        int i3=-158, i4=-10, i12=-58, i13=-206, i14=206, i15=70;
        double d=111.100051;
        boolean b=true;
        float fArr[]=new float[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(fArr, -74.369F);
        FuzzerUtils.init(lArr, 3676849496L);

        for (i3 = 3; i3 < 332; i3++) {
            switch ((i3 % 3) + 99) {
            case 99:
                i4 >>= (int)(Math.abs(i4 * Test.instanceCount) + 49330);
                vMeth1();
                fArr[i3 + 1] += 105;
                break;
            case 100:
                d = i4;
                for (i12 = 1; i12 < 5; ++i12) {
                    i4 -= i12;
                    if (b) break;
                    for (i14 = i12; i14 < 2; i14++) {
                        if (true) continue;
                        i13 -= i12;
                        Test.instanceCount = i3;
                        i13 += i12;
                        i4 >>>= (int)Test.instanceCount;
                    }
                }
                break;
            case 101:
                lArr[i3] /= ((long)(d) | 1);
            default:
                i13 ^= i12;
            }
        }
        long meth_res = i3 + i4 + Double.doubleToLongBits(d) + i12 + i13 + (b ? 1 : 0) + i14 + i15 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void vMeth(int i2, float f) {

        double d1=0.114849;
        int i16=-186, i17=9, i18=-1, i19=-64, i20=11;
        boolean b1=true, bArr[]=new boolean[N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(lArr1, 7407996739357713412L);

        iMeth();
        d1 *= i2;
        i16 = 231;
        while ((i16 -= 3) > 0) {
            i2 = i2;
            Test.iArrFld[i16][i16] *= i2;
            switch (((i2 >>> 1) % 1) + 75) {
            case 75:
                if (b1) continue;
                i2 += 55437;
                bArr[i16 + 1] = b1;
            default:
                for (i17 = 1; i17 < 20; i17++) {
                    for (i19 = i17; i19 < 2; i19++) {
                        switch (((i20 >>> 1) % 2) + 10) {
                        case 10:
                            i20 = i17;
                            Test.iArrFld[i17 - 1][i16 + 1] *= i2;
                            break;
                        case 11:
                            lArr1[i17] >>= -48;
                            break;
                        }
                    }
                }
            }
        }
        vMeth_check_sum += i2 + Float.floatToIntBits(f) + Double.doubleToLongBits(d1) + i16 + (b1 ? 1 : 0) + i17 + i18
            + i19 + i20 + FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(lArr1);
    }

    public void mainTest(String[] strArr1) {

        int i=-58800, i1=31513, i21=38, i22=3, i23=74, i24=37377, iArr1[]=new int[N];
        boolean b2=true;
        double d2=-40.45679;
        long lArr2[][]=new long[N][N];

        FuzzerUtils.init(lArr2, -8L);
        FuzzerUtils.init(iArr1, -3020);

        for (i = 233; i > 7; i -= 2) {
            switch (((i % 2) * 5) + 20) {
            case 28:
                vMeth(i1, fFld);
                for (i21 = 222; i21 > 3; --i21) {
                    i22 += i21;
                    if (false) break;
                    lArr2[i - 1][i21] = i21;
                    if (b2) break;
                    for (i23 = i21; 2 > i23; ++i23) {
                        sFld = (short)-58055L;
                        if (b2) {
                            if (b2) continue;
                            Test.instanceCount *= Test.instanceCount;
                            i22 += (int)Test.instanceCount;
                            iArr1[i21 - 1] >>= sFld;
                        }
                        i24 += i21;
                        if (false) {
                            Test.instanceCount = Test.instanceCount;
                        } else {
                            i22 = (int)Test.instanceCount;
                        }
                        switch ((i23 % 1) + 65) {
                        case 65:
                            iArr1 = Test.iArrFld[i21];
                            d2 = fFld;
                            Test.instanceCount = 128;
                            break;
                        default:
                            Test.instanceCount = i;
                            d2 += i1;
                        }
                        i24 = i;
                        i24 += (213 + (i23 * i23));
                        i22 -= i23;
                    }
                    fFld *= (float)d2;
                }
                i24 += i21;
            case 30:
                Test.instanceCount >>>= i23;
                break;
            default:
                i24 += (int)fFld;
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}